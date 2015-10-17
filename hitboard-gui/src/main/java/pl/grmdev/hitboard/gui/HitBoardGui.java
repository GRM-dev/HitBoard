/**
 * 
 */
package pl.grmdev.hitboard.gui;

import java.awt.EventQueue;

import javafx.application.Platform;
import pl.grmdev.hitboard.HitBoardCore;
/**
 * @author Levvy055
 */
public class HitBoardGui {
	
	private static HitBoardGui instance;
	private ActionSelectionFrame actionSelectionFrame;
	private HitBoardCore core;
	private HitBoardFx hitBoardFx;
	
	/**
	 * @param core
	 *            {@link HitBoardCore}
	 */
	public HitBoardGui(HitBoardCore core) {
		this.core = core;
		instance = this;
	}
	
	/**
	 * Opens start action selection window
	 */
	private void openSelectionWindow() {
		EventQueue.invokeLater(() -> {
			try {
				actionSelectionFrame = new ActionSelectionFrame(this);
				actionSelectionFrame.setVisible(true);
				actionSelectionFrame.setDefaultFocusKey();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
	
	/**
	 * Gets instance of this class last created object
	 * 
	 * @return instance of {@link HitBoardGui} class
	 */
	public static HitBoardGui instance() {
		return instance;
	}
	
	public ActionSelectionFrame getActionSelectionFrame() {
		return actionSelectionFrame;
	}
	
	/**
	 * @return core of type {@link HitBoardCore}
	 */
	public HitBoardCore getCore() {
		return core;
	}
	
	/**
	 * @param hitBoardFx
	 *            {@link HitBoardFx}
	 */
	public void setStreamManager(HitBoardFx hitBoardFx) {
		this.hitBoardFx = hitBoardFx;
	}
	
	/**
	 * Closes program
	 */
	public void close() {
		core.close();
		if (getHitBoardFx() != null) {
			Platform.exit();
		}
	}
	
	/**
	 * Gets {@link HitBoardFx}
	 * 
	 * @return javafx stream manager window app
	 */
	public HitBoardFx getHitBoardFx() {
		return hitBoardFx;
	}
	
	/**
	 * Start program method
	 * 
	 * @param args
	 *            run args
	 */
	public static void main(String[] args) {
		HitBoardCore core = HitBoardCore.instance();
		HitBoardGui gui = new HitBoardGui(core);
		gui.openSelectionWindow();
	}
}
