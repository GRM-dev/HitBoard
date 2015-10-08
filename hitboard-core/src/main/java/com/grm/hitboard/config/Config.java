/**
 * 
 */
package com.grm.hitboard.config;

import java.util.*;
import java.util.logging.Logger;

import com.grm.hitboard.HitBoardCore;

/**
 * @author Levvy055
 *
 */
public class Config {

	public static final String EXECUTABLE_PATH = System.getProperty("user.dir") + "\\";
	public static final String CONFIG_FILE_NAME = "config.ini";
	public static final String LOGGER_FILE_NAME = "hitboard.log";
	public static final String APP_NAME = "HitBoard";
	private HashMap<ConfigId, String> configs;
	private HitBoardCore hitBoard;
	private Logger logger;
	private boolean needsSave;

	/**
	 * @param hitBoard
	 */
	public Config(HitBoardCore hitBoard) {
		this.hitBoard = hitBoard;
		this.logger = HitBoardCore.getLogger();
		configs = createDefaultConfig();
	}

	public void init() {
		if (FileOperation.configExists()) {
			HashMap<ConfigId, String> fileConf = FileOperation.readConfig();
			for (Iterator<ConfigId> it = fileConf.keySet().iterator(); it.hasNext();) {
				ConfigId key = it.next();
				String newValue = fileConf.get(key);
				String oldValue = configs.get(key);
				if (!newValue.equals(oldValue)) {
					logger.info("Read " + key + ": " + newValue + " (default: "
							+ (oldValue.isEmpty() ? "\"\"" : oldValue) + ")");
					setConfigValue(key, newValue);
					needsSave = false;
				}
			}
		} else {
			FileOperation.saveConfig(configs);
		}
	}

	/**
	 * @return default config map
	 */
	private HashMap<ConfigId, String> createDefaultConfig() {
		HashMap<ConfigId, String> configD = new HashMap<>();
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
	public void setConfigValue(ConfigId key, String value) {
		if (value != null) {
			needsSave = true;
			configs.put(key, value);
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
