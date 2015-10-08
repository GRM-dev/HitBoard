/**
 * 
 */
package com.grm.hitboard;

import java.util.logging.Logger;

import com.grm.hitboard.config.*;

/**
 * @author Levvy055
 *
 */
public class HitBoardCore {

	private static HitBoardCore instance;
	private Logger logger;
	private Config config;

	private HitBoardCore() {
	}

	/**
	 * Initializes HitBoard
	 */
	private void init() {
		logger = FileOperation.setupLogger(Config.LOGGER_FILE_NAME);
		config = new Config(this);
		config.init();
	}

	public void close() {
		getConfig().save();
	}

	/**
	 * Gets instance of main class
	 * 
	 * @return HitBoard
	 */
	public static HitBoardCore instance() {
		if (instance == null) {
			instance = new HitBoardCore();
			instance.init();
		}
		return instance;
	}

	/**
	 * Gets logger
	 * 
	 * @return Logger
	 */
	public static Logger getLogger() {
		return instance().logger;
	}

	/**
	 * gets Config
	 * 
	 * @return config
	 */
	public Config getConfig() {
		return config;
	}
}
