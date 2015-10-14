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
	 * @param config
	 *            map of configs
	 */
	public static void saveConfig(HashMap<ConfigId, String> config) {
		File file = new File(Config.CONFIG_FILE_NAME);
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			Ini ini = new Wini(file);
			for (Iterator<ConfigId> it = config.keySet().iterator(); it
					.hasNext();) {
				ConfigId key = it.next();
				String value = config.get(key);
				ini.add("configuration", key.toString(), value);
			}
			ini.store();
		} catch (IOException e) {
			logger.log(Level.CONFIG, "cannot save config file", e);
			e.printStackTrace();
		}
	}
	
	/**
	 * Reads config file
	 * 
	 * @return map of configs read from file
	 */
	public static HashMap<ConfigId, String> readConfig() {
		HashMap<ConfigId, String> fConfig = new HashMap<>();
		File file = new File(Config.CONFIG_FILE_NAME);
		try {
			Ini ini = new Wini(file);
			Section section = ini.get("configuration");
			if (section == null) {
				throw new IOException("Cannot find configuration section");
			}
			for (String key : section.keySet()) {
				try {
					ConfigId keyE = ConfigId.getFromString(key);
					fConfig.put(keyE, section.get(key));
				} catch (IllegalArgumentException e) {
					logger.log(Level.CONFIG,
							"Config with name " + key + " not exists", e);
				}
			}
		} catch (IOException e) {
			logger.log(Level.CONFIG,
					"cannot load config file. Try to repair it or delete", e);
			e.printStackTrace();
		}
		return fConfig;
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
}
