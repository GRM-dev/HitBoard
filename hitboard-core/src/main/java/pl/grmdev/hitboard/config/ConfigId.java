/**
 * 
 */
package pl.grmdev.hitboard.config;

/**
 * @author Levvy055
 *
 */
public enum ConfigId {
	LAST_SAVE_PATH(""), LAST_FILE_NAME("video.mp4"), HITBOX_API_LINK(
			"http://api.hitbox.tv/");

	private String defValue;

	private ConfigId(String defValue) {
		this.defValue = defValue;
	}

	public static ConfigId getFromString(String name)
			throws IllegalArgumentException {
		return Enum.valueOf(ConfigId.class, name);
	}

	public String getDefValue() {
		return defValue;
	}
}
