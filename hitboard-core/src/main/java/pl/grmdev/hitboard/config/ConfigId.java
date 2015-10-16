/**
 * 
 */
package pl.grmdev.hitboard.config;

/**
 * Contains all config parameters with default values
 * 
 * @author Levvy055
 */
public enum ConfigId {
	LAST_SAVE_PATH("none"),
	LAST_FILE_NAME("video.mp4"),
	HITBOX_API_LINK("http://api.hitbox.tv/"),
	LOGIN_SAVE_LOGIN(false),
	LOGIN_AUTO_LOGIN(false),
	LOGIN_LOGIN("username"),
	LOGIN_PSWD(new byte[]{}),
	LOGIN_IV(new byte[]{});
	
	private Object defValue;
	
	private ConfigId(Object defValue) {
		this.defValue = defValue;
	}
	
	public static ConfigId getFromString(String name)
			throws IllegalArgumentException {
		return Enum.valueOf(ConfigId.class, name);
	}
	
	public Object getDefValue() {
		return defValue;
	}
}
