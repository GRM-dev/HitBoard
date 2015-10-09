/**
 * 
 */
package pl.grmdev.hitboard.gui.controllers;

/**
 * @author Levvy055
 *
 */
public enum SideNodeName {
	DASHBOARD("DashBoard"), STATS("Stats"), WIDGETS("Widgets"), SYNC(
			"Sync"), VIDEOS("Videos"), ACCOUNT_SETTINGS(
					"Account Settings"), SETTINGS("Settings");

	private String name;

	private SideNodeName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public SideNodeName getById(int id) {
		return SideNodeName.values()[id];
	}
}
