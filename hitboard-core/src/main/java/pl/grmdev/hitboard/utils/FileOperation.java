package pl.grmdev.hitboard.utils;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;

import org.ini4j.*;
import org.ini4j.Profile.Section;

import pl.grmdev.hitboard.config.Config;
import pl.grmdev.hitboard.config.ConfigId;
public class FileOperation {
	
	private static Logger logger;
	
	/**
	 * Gets current jar execution location
	 * 
	 * @param classHandler
	 *            a class which will be handler to our jar file
	 * @return path of jar
	 * @throws UnsupportedEncodingException
	 *             when decoder catch unsupported encoding
	 */
	public static String getCurrentJarPath(Class<?> classHandler)
			throws UnsupportedEncodingException {
		String jarFileLoc = "";
		jarFileLoc = URLDecoder.decode(classHandler.getProtectionDomain()
				.getCodeSource().getLocation().getPath(), "UTF-8");
		jarFileLoc = jarFileLoc.replace("file:/", "");
		int index = 100;
		if (jarFileLoc.contains("!")) {
			index = jarFileLoc.indexOf("!");
			jarFileLoc = jarFileLoc.substring(0, index);
		}
		if (jarFileLoc.contains("/")) {
			index = jarFileLoc.indexOf("/");
			if (index == 0) {
				jarFileLoc = jarFileLoc.substring(1, jarFileLoc.length());
			}
		}
		return jarFileLoc;
	}
	
	/**
	 * Setups Logger and returns it
	 * 
	 * @param fileName
	 *            name of logger log file
	 * @return created Logger
	 * @throws IllegalArgumentException
	 */
	public static Logger setupLogger(String fileName) {
		logger = Logger.getLogger(fileName);
		try {
			String logFilename = Config.EXEC_PATH + fileName;
			File logFile = new File(logFilename);
			if (logFile.exists() && logFile.length() >= 51200) {
				logFile.renameTo(new File(logFilename + "_old"));
			}
			FileHandler fileHandler = new FileHandler(logFilename, 1048476, 1,
					true);
			logger.addHandler(fileHandler);
			SimpleFormatter formatter = new SimpleFormatter();
			fileHandler.setFormatter(formatter);
		} catch (SecurityException e) {} catch (IOException e) {}
		logger.info("Execution Location: " + Config.EXEC_PATH);
		return logger;
	}
	
	/**
	 * Checks if config file exists
	 * 
	 * @return true if config file exists
	 */
	public static boolean configExists() {
		File file = new File(Config.CONFIG_FILE_NAME);
		if (file.exists()) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Saves config in config file
	 * 
	 * @param configs
	 *            map of configs
	 */
	public static void saveConfig(Map<ConfigId, Object> configs) {
		File file = new File(Config.CONFIG_FILE_NAME);
		try {
			Ini ini = getIni(file);
			int arraysId = 0;
			for (Iterator<ConfigId> it = configs.keySet().iterator(); it
					.hasNext();) {
				ConfigId key = it.next();
				Object obj = configs.get(key);
				arraysId = saveKey(ini, arraysId, key, obj);
			}
			ini.store();
		} catch (IOException e) {
			logger.log(Level.CONFIG, "cannot save config file", e);
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
	
	private static int saveKey(Ini ini, int arrayId, ConfigId key, Object obj)
			throws NoSuchMethodException {
		if (obj.getClass().isArray()) {
			@SuppressWarnings("rawtypes")
			List list = ArrayUtil.disperseToList(obj);
			ini.add("configuration", key.toString(), "array_" + (++arrayId));
			for (int i = 0; i < list.size(); i++) {
				ini.add("array_" + arrayId, "a_" + i, list.get(i));
			}
		} else if (obj.getClass().getMethod("toString")
				.getDeclaringClass() != Object.class) {
			ini.add("configuration", key.toString(), obj);
		}
		return arrayId;
	}
	
	/**
	 * Reads config file
	 * 
	 * @return map of configs read from file
	 */
	public static HashMap<ConfigId, Object> readConfig() {
		HashMap<ConfigId, Object> fConfig = new HashMap<>();
		File file = new File(Config.CONFIG_FILE_NAME);
		try {
			Ini ini = getIni(file);
			Section section = ini.get("configuration");
			if (section == null) {
				logger.log(Level.CONFIG, "Cannot find configuration section");
				return fConfig;
			}
			for (String key : section.keySet()) {
				try {
					ConfigId keyE = ConfigId.getFromString(key);
					Object value = section.get(key);
					if (((String) value).equals("true")
							|| ((String) value).equals("false")) {
						value = Boolean.parseBoolean((String) value);
					}
					Object readedKey = parseKey(ini, value);
					if (readedKey != null) {
						fConfig.put(keyE, readedKey);
					}
				} catch (IllegalArgumentException e) {
					logger.log(Level.CONFIG, "Config with name " + key
							+ " not exists or is corrupted", e);
				}
			}
		} catch (IOException e) {
			logger.log(Level.CONFIG,
					"cannot load config file. Try to repair it or delete", e);
			e.printStackTrace();
		}
		return fConfig;
	}
	
	private static Object parseKey(Ini ini, Object value)
			throws UnsupportedEncodingException {
		if (value.getClass() == String.class) {
			if (((String) value).startsWith("array_")) {
				Section arrSection = ini.get(value);
				if (arrSection != null && !arrSection.isEmpty()) {
					int arrSectionSize = arrSection.size();
					byte[] arr = new byte[arrSectionSize];
					Iterator<String> it = arrSection.keySet().iterator();
					while (it.hasNext()) {
						String v = it.next();
						String elIdS = v.substring(2, v.length());
						int arrElemInd = Integer.parseInt(elIdS);
						arr[arrElemInd] = Byte.parseByte(arrSection.get(v));
					}
					return arr;
				}
				return null;
			} else if (Boolean.parseBoolean((String) value)) {
				return Boolean.parseBoolean((String) value);
			} else {
				return value;
			}
		}
		return value;
	}
	
	public static void closeQuietly(FileInputStream in) {
		if (in != null) {
			try {
				in.close();
			} catch (IOException e) {}
		}
	}
	
	/**
	 * Gets File object of filename param
	 * 
	 * @param fileName
	 *            file name to return file from this method
	 * @return File of specified filename
	 * @throws FileNotFoundException
	 *             thrown when file doesn't exists
	 */
	public static File getFile(String fileName) throws FileNotFoundException {
		ClassLoader classLoader = FileOperation.class.getClassLoader();
		URL resFile = classLoader.getResource(fileName);
		File file;
		if (resFile != null) {
			file = new File(resFile.getFile());
		} else {
			file = new File(fileName);
		}
		if (file == null || !file.exists()) {
			throw new FileNotFoundException(
					"Nie znaleziono pliku o nazwie " + fileName);
		}
		return file;
	}
	
	private static Ini getIni(File file) throws IOException,
			FileNotFoundException, InvalidFileFormatException {
		if (!file.exists()) {
			file.createNewFile();
		}
		Ini ini;
		try {
			ini = new Wini(file);
		} catch (IOException e) {
			file.setWritable(true);
			if (!file.delete()) {
				PrintWriter writer = new PrintWriter(file);
				writer.println("");
				writer.flush();
				writer.close();
			} else {
				file.createNewFile();
			}
			ini = new Wini(file);
		}
		return ini;
	}
}
