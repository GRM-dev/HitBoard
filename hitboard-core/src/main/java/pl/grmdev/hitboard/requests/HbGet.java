/**
 * 
 */
package pl.grmdev.hitboard.requests;

/**
 * @author Levvy055
 *
 */
public enum HbGet {
	CHAT_SERVERS("chat/servers");

	private String cmd;

	private HbGet(String cmd) {
		this.cmd = cmd;
	}

	public String get() {
		return cmd;
	}
}
