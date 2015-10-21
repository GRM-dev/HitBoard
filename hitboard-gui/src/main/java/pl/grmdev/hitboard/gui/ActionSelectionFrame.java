/**
 * 
 */
package pl.grmdev.hitboard.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import pl.grmdev.hitboard.config.Config;
/**
 * @author Levvy055
 */
public class ActionSelectionFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private HitBoardGui hitBoard;
	private JButton btnMsnageStream;
	
	/**
	 * Create the frame.
	 * 
	 * @param hitBoardGui
	 *            main gui start object
	 * @see HitBoardGui
	 */
	public ActionSelectionFrame(HitBoardGui hitBoardGui) {
		this.hitBoard = hitBoardGui;
		setResizable(false);
		setTitle(Config.APP_NAME);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 200, 350, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		JPanel panel_Top = new JPanel();
		contentPane.add(panel_Top, BorderLayout.NORTH);
		JLabel lblWhatYouWanna = new JLabel("What you wanna do?");
		panel_Top.add(lblWhatYouWanna);
		JLayeredPane panel_Main = new JLayeredPane();
		contentPane.add(panel_Main, BorderLayout.CENTER);
		panel_Main.setLayout(new GridLayout(1, 0, 0, 0));
		btnMsnageStream = new JButton(
				"<html><center>Manage <br>your Stream</center></html>");
		btnMsnageStream.setMnemonic('S');
		btnMsnageStream.addActionListener(e -> {
			hitBoard.showStreamManagerWindow();
		});
		panel_Main.add(btnMsnageStream);
		this.getRootPane().setDefaultButton(btnMsnageStream);
		JButton btnWatchStream = new JButton(
				"<html><center>Watch Stream</center></html>");
		btnWatchStream.setMnemonic('W');
		btnWatchStream.addActionListener(e -> {});
		panel_Main.add(btnWatchStream);
		JButton btnDownloadVideo = new JButton(
				"<html><center>Download Video</center></html>");
		btnDownloadVideo.setMnemonic('D');
		btnDownloadVideo.addActionListener(e -> {
			hitBoard.openDownlodWindow();
		});
		panel_Main.add(btnDownloadVideo);
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				btnMsnageStream.requestFocusInWindow();
			}
			
			@Override
			public void windowIconified(WindowEvent e) {}
			
			@Override
			public void windowDeiconified(WindowEvent e) {}
			
			@Override
			public void windowDeactivated(WindowEvent e) {}
			
			@Override
			public void windowClosing(WindowEvent e) {
				hitBoard.close();
			}
			
			@Override
			public void windowClosed(WindowEvent e) {}
			
			@Override
			public void windowActivated(WindowEvent e) {}
		});
	}
	
	/**
	 * Shows frame
	 * 
	 * @param show
	 *            if true shows ASF. If false set visible to falses
	 */
	public void showFrame(boolean show) {
		this.setEnabled(show);
		this.setVisible(show);
		if (show) {
			this.setState(JFrame.NORMAL);
			this.toFront();
		} else {
			this.setState(JFrame.ICONIFIED);
		}
	}
}
