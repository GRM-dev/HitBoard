/**
 * 
 */
package pl.grmdev.hitboard;

import java.util.logging.Logger;

import pl.grmdev.hitboard.config.*;
import pl.grmdev.hitboard.requests.RequestHandler;
/**
 * Core class for all HitBox RESTful API features
 * 
 * @author Levvy055
 */
public class HitBoardCore {
	
	private static HitBoardCore instance;
	private Logger logger;
	private Config config;
	private RequestHandler reqHandler;
	
	private HitBoardCore() {
		instance = this;
		logger = FileOperation.setupLogger(Config.LOGGER_FILE_NAME);
		config = new Config(this);
		config.init();
		String apiLink = config.getConfigValue(ConfigId.HITBOX_API_LINK);
		reqHandler = new RequestHandler(apiLink);
	}
	
	/**
	 * Closes program
	 */
	public void close() {
		getConfig().save();
	}
	
	/**
	 * Gets instance of main class. If it doesn't exists than creates one.
	 * 
	 * @return HitBoard
	 */
	public static HitBoardCore instance() {
		if (instance == null) {
			new HitBoardCore();
		}
		return instance;
	}
	
	/**
	 * Gets {@link Logger}
	 * 
	 * @return Logger
	 */
	public static Logger getLogger() {
		return instance().logger;
	}
	
	/**
	 * gets {@link Config}
	 * 
	 * @return config object
	 */
	public Config getConfig() {
		return config;
	}
	
	/**
	 * gets {@link RequestHandler} object
	 * 
	 * @return {@link RequestHandler}
	 */
	public RequestHandler getRequestHandler() {
		return reqHandler;
	}
}
