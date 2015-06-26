/**
 * 
 */
package com.grm.hitboard;

import java.awt.EventQueue;
import java.util.logging.Logger;

import com.grm.hitboard.config.*;
import com.grm.hitboard.gui.ActionSelectionFrame;

/**
 * @author Levvy055
 *
 */
public class HitBoard {

	private static HitBoard instance;
	private Logger logger;
	private Config config;
	private ActionSelectionFrame actionSelectionFrame;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		instance = new HitBoard();
		instance.init();
		instance.startDefault();
	}

	/**
	 * Initializes HitBoard
	 */
	private void init() {
		logger = FileOperation.setupLogger(Config.LOGGER_FILE_NAME);
		config = new Config(this);
		config.init();
	}

	/**
	 * Starts App from default start window
	 */
	private void startDefault() {
		EventQueue.invokeLater(() -> {
			try {
				actionSelectionFrame = new ActionSelectionFrame(this);
				actionSelectionFrame.setVisible(true);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Gets instance of main class
	 * 
	 * @return HitBoard
	 */
	public static HitBoard instance() {
		if (instance == null) {
			instance = new HitBoard();
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
