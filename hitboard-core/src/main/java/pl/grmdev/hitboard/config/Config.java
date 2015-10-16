/**
 * 
 */
package pl.grmdev.hitboard.config;

import java.util.*;
import java.util.logging.Logger;

import pl.grmdev.hitboard.HitBoardCore;
import pl.grmdev.hitboard.utils.FileOperation;
/**
 * Handles all condfigurations things like load/save settings from/to
 * file/program. Also changes config values.
 * 
 * @author Levvy055
 */
public class Config {
	
	public static final String USER_DIR = System.getProperty("user.dir");
	public static final String EXEC_PATH = USER_DIR + "\\";
	public static final String CONFIG_FILE_NAME = "config.ini";
	public static final String LOGGER_FILE_NAME = "hitboard.log";
	public static final String APP_NAME = "HitBoard";
	private Map<ConfigId, Object> configs;
	private HitBoardCore hitBoard;
	private Logger logger;
	private boolean needsSave;
	
	/**
	 * Config object is created by {@link HitBoardCore}. At creation it also
	 * loads default values from {@link ConfigId} enum
	 * 
	 * @param hitBoard
	 *            core object of {@link HitBoardCore}
	 */
	public Config(HitBoardCore hitBoard) {
		this.hitBoard = hitBoard;
		this.logger = HitBoardCore.getLogger();
		configs = createDefaultConfig();
	}
	
	/**
	 * Initializes config by following: If file exists than load it, but if not
	 * than create new one at defaul location
	 */
	public void init() {
		if (FileOperation.configExists()) {
			HashMap<ConfigId, Object> fileConf = FileOperation.readConfig();
			for (Iterator<ConfigId> it = fileConf.keySet().iterator(); it
					.hasNext();) {
				ConfigId key = it.next();
				Object newValue = fileConf.get(key);
				Object oldValue = configs.get(key);
				if (!newValue.equals(oldValue)) {
					logger.info("Read " + key + ": " + newValue + " (default: "
							+ (oldValue == null ? "<>" : oldValue) + ")");
					set(key, newValue);
					needsSave = false;
				}
			}
		} else {
			FileOperation.saveConfig(configs);
		}
	}
	
	/**
	 * @return default config map from {@link ConfigId}
	 */
	private Map<ConfigId, Object> createDefaultConfig() {
		Map<ConfigId, Object> configD = new HashMap<>();
		for (ConfigId conf : ConfigId.values()) {
			configD.put(conf, conf.getDefValue());
		}
		return configD;
	}
	
	/**
	 * Updates config value with new one
	 * 
	 * @param key
	 *            config of which value we want to update
	 * @param value
	 *            new value to override previous one
	 */
	public void set(ConfigId key, Object value) {
		if (!configs.get(key).equals(value)) {
			needsSave = true;
			configs.put(key, value);
		}
	}
	
	/**
	 * Reads specified value from config
	 * 
	 * @param confId
	 *            id of config property which value you want to acquire
	 * @return
	 * @return value from config if exists, otherwise null
	 */
	@SuppressWarnings("unchecked")
	public <E> E get(ConfigId confId) {
		if (configs.containsKey(confId)) {
			Object object = configs.get(confId);
			if (object instanceof String) {
				String c = (String) object;
				if (c.equals("true") || c.equals("false")) {
					object = Boolean.parseBoolean(c);
				}
			}
			return (E) object;
		} else {
			return null;
		}
	}
	
	/**
	 * Save config and ammends all actions when closing
	 */
	public void save() {
		if (needsSave) {
			FileOperation.saveConfig(configs);
		}
	}
}
