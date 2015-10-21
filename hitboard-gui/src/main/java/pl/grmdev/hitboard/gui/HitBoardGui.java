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
	private DownloadVideoFrame downloadVideoFrame;
	
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
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
	
	/**
	 * Opens HitBoard Stream Manager window in javaFX
	 */
	public void showStreamManagerWindow() {
		if (getHitBoardFx() == null) {
			HitBoardFx.launchStreamManager();
		} else {
			Platform.runLater(() -> getHitBoardFx().showLoginDialog());
		}
		actionSelectionFrame.showFrame(false);
	}
	
	/**
	 * Opens Video Download window
	 */
	public void openDownlodWindow() {
		try {
			if (downloadVideoFrame == null) {
				downloadVideoFrame = new DownloadVideoFrame(this);
			}
			downloadVideoFrame.setVisible(true);
			actionSelectionFrame.showFrame(false);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
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
