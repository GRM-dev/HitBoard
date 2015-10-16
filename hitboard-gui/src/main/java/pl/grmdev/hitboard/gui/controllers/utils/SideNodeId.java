/**
 * 
 */
package pl.grmdev.hitboard.gui.controllers.utils;

import pl.grmdev.hitboard.gui.controllers.MainForm;

/**
 * Names of inner screens switched by left panel in {@link MainForm}
 * 
 * @author Levvy055
 */
public enum SideNodeId {
	DASHBOARD("DashBoard"),
	STATS("Stats"),
	WIDGETS("Widgets"),
	SYNC("Sync"),
	VIDEOS("Videos"),
	ACCOUNT_SETTINGS("Account Settings"),
	SETTINGS("Settings");
	
	private String name;
	
	private SideNodeId(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public SideNodeId getById(int id) {
		return SideNodeId.values()[id];
	}
}
