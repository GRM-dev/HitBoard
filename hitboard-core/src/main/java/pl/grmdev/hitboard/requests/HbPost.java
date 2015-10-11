/**
 * 
 */
package pl.grmdev.hitboard.requests;

/**
 * @author Levvy055
 *
 */
public enum HbPost {
	;

	private String cmd;

	private HbPost(String cmd) {
		this.cmd = cmd;
	}

	public String get() {
		return cmd;
	}
}
