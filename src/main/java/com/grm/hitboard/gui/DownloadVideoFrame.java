/**
 * 
 */
package com.grm.hitboard.gui;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * @author Levvy055
 *
 */
public class DownloadVideoFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFrame frame;
	private JTextField tF_videoURL;
	private JTextField tF_FileName;
	private JTextField tF_SaveLocation;

	/**
	 * Create the frame.
	 * 
	 * @param frame
	 */
	public DownloadVideoFrame(JFrame frame) {
		setType(Type.UTILITY);
		setResizable(false);
		this.frame = frame;
		setTitle("Download Video from Hitbox");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel_Top = new JPanel();
		contentPane.add(panel_Top, BorderLayout.NORTH);

		JLabel lblInfo = new JLabel("Info: ");
		panel_Top.add(lblInfo);

		JPanel panel_Main = new JPanel();
		contentPane.add(panel_Main, BorderLayout.CENTER);
		panel_Main.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_Main.add(panel);

		JLabel lblVideoUrlPath = new JLabel("Video URL Path: ");
		panel.add(lblVideoUrlPath);

		tF_videoURL = new JTextField();
		panel.add(tF_videoURL);
		tF_videoURL.setColumns(50);

		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_Main.add(panel_1);

		JLabel lblFileName = new JLabel("File Name: ");
		panel_1.add(lblFileName);

		tF_FileName = new JTextField();
		panel_1.add(tF_FileName);
		tF_FileName.setColumns(10);

		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_Main.add(panel_2);

		JLabel lblSaveLocation = new JLabel("Save Location");
		panel_2.add(lblSaveLocation);

		tF_SaveLocation = new JTextField();
		panel_2.add(tF_SaveLocation);
		tF_SaveLocation.setColumns(35);

		JButton btnChangeDirectory = new JButton("Change directory ...");
		btnChangeDirectory.addActionListener(e -> {
			File file = new File(tF_SaveLocation.getText());
			JFileChooser chooser;
			if (file.exists()) {
				chooser = new JFileChooser(file);
			} else {
				chooser = new JFileChooser(new File("."));
			}
			chooser.setDialogTitle("Select directory where you want to save videos");
			chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			chooser.setMultiSelectionEnabled(false);
			chooser.setAcceptAllFileFilterUsed(false);
			if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
				tF_SaveLocation.setText(chooser.getSelectedFile().getAbsolutePath());
			}
		});
		panel_2.add(btnChangeDirectory);

		JPanel panel_Bottom = new JPanel();
		contentPane.add(panel_Bottom, BorderLayout.SOUTH);

		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(e -> {
			this.dispose();
		});
		panel_Bottom.add(btnClose);

		this.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {}

			@Override
			public void windowIconified(WindowEvent e) {}

			@Override
			public void windowDeiconified(WindowEvent e) {}

			@Override
			public void windowDeactivated(WindowEvent e) {}

			@Override
			public void windowClosing(WindowEvent e) {}

			@Override
			public void windowClosed(WindowEvent e) {
				frame.setEnabled(true);;
			}

			@Override
			public void windowActivated(WindowEvent e) {}
		});
	}

}
