/**
 * 
 */
package pl.grmdev.hitboard;

import java.util.logging.Logger;

import pl.grmdev.hitboard.config.*;
import pl.grmdev.hitboard.requests.RequestHandler;
/**
 * @author Levvy055
 */
public class HitBoardCore {
	
	private static HitBoardCore instance;
	private Logger logger;
	private Config config;
	private RequestHandler reqHandler;
	
	private HitBoardCore() {}
	
	/**
	 * Initializes HitBoard
	 */
	private void init() {
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
