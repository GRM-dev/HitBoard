/**
 * 
 */
package com.grm.hitboard.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import com.grm.hitboard.HitBoard;
import com.grm.hitboard.config.Config;

/**
 * @author Levvy055
 *
 */
public class ActionSelectionFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private DownloadVideoFrame downloadVideoFrame;
	private HitBoard hitBoard;

	/**
	 * Create the frame.
	 * 
	 * @param hitBoard
	 */
	public ActionSelectionFrame(HitBoard hitBoard) {
		this.hitBoard = hitBoard;
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
		}
		catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		JPanel panel_Top = new JPanel();
		contentPane.add(panel_Top, BorderLayout.NORTH);

		JLabel lblWhatYouWanna = new JLabel("What You wanna do?");
		panel_Top.add(lblWhatYouWanna);

		JLayeredPane panel_Main = new JLayeredPane();
		contentPane.add(panel_Main, BorderLayout.CENTER);
		panel_Main.setLayout(new GridLayout(1, 0, 0, 0));

		JButton btnEditStreamInfo = new JButton("<html><center>Edit <br>Stream Info</center></html>");
		btnEditStreamInfo.addActionListener(e -> {});
		panel_Main.add(btnEditStreamInfo);

		JButton btnWatchStream = new JButton("<html><center>Watch Stream</center></html>");
		btnWatchStream.addActionListener(e -> {});
		panel_Main.add(btnWatchStream);

		JButton btnDownloadVideo = new JButton("<html><center>Download Video</center></html>");
		btnDownloadVideo.addActionListener(e -> {
			try {
				if (downloadVideoFrame == null) {
					downloadVideoFrame = new DownloadVideoFrame(this);
				}
				ActionSelectionFrame.this.setEnabled(false);
				downloadVideoFrame.setVisible(true);
			}
			catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		panel_Main.add(btnDownloadVideo);
		addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {}

			@Override
			public void windowIconified(WindowEvent e) {}

			@Override
			public void windowDeiconified(WindowEvent e) {}

			@Override
			public void windowDeactivated(WindowEvent e) {}

			@Override
			public void windowClosing(WindowEvent e) {
				hitBoard.getConfig().save();
			}

			@Override
			public void windowClosed(WindowEvent e) {}

			@Override
			public void windowActivated(WindowEvent e) {}
		});
	}

}
