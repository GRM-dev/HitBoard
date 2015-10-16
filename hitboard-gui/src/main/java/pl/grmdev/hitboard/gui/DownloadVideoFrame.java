/**
 * 
 */
package pl.grmdev.hitboard.gui;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import pl.grmdev.hitboard.HitBoardCore;
import pl.grmdev.hitboard.config.*;
import pl.grmdev.hitboard.video.VideoDownloader;
/**
 * @author Levvy055
 */
public class DownloadVideoFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ActionSelectionFrame parentFrame;
	private JTextField tF_videoURL;
	private JTextField tF_FileName;
	private JTextField tF_SaveLocation;
	private JButton btnChangeDirectory;
	private JFileChooser chooser;
	private JButton btnClose;
	private JButton btnSave;
	
	/**
	 * Create the frame.
	 * 
	 * @param hitBoard
	 *            main gui program object
	 */
	public DownloadVideoFrame(HitBoardGui hitBoard) {
		Config config = HitBoardCore.instance().getConfig();
		setType(Type.POPUP);
		setResizable(false);
		this.parentFrame = hitBoard.getActionSelectionFrame();
		setTitle("Download Video from Hitbox");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 400);
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
		GridBagLayout gbl_panel_Main = new GridBagLayout();
		gbl_panel_Main.columnWidths = new int[]{530};
		gbl_panel_Main.rowHeights = new int[]{120, 50, 50, 0};
		gbl_panel_Main.columnWeights = new double[]{0.0};
		gbl_panel_Main.rowWeights = new double[]{0.0, 0.0, 0.0,
				Double.MIN_VALUE};
		panel_Main.setLayout(gbl_panel_Main);
		JPanel panel_Video = new JPanel();
		FlowLayout fl_panel_Video = (FlowLayout) panel_Video.getLayout();
		fl_panel_Video.setAlignment(FlowLayout.LEFT);
		GridBagConstraints gbc_panel_Video = new GridBagConstraints();
		gbc_panel_Video.fill = GridBagConstraints.BOTH;
		gbc_panel_Video.insets = new Insets(0, 0, 5, 0);
		gbc_panel_Video.gridx = 0;
		gbc_panel_Video.gridy = 0;
		panel_Main.add(panel_Video, gbc_panel_Video);
		JLabel lblVideoUrlPath = new JLabel("Video URL Path: ");
		panel_Video.add(lblVideoUrlPath);
		tF_videoURL = new JTextField();
		tF_videoURL.setColumns(40);
		panel_Video.add(tF_videoURL);
		JPanel panel_FN = new JPanel();
		FlowLayout fl_panel_FN = (FlowLayout) panel_FN.getLayout();
		fl_panel_FN.setAlignment(FlowLayout.LEFT);
		GridBagConstraints gbc_panel_FN = new GridBagConstraints();
		gbc_panel_FN.fill = GridBagConstraints.BOTH;
		gbc_panel_FN.insets = new Insets(0, 0, 5, 0);
		gbc_panel_FN.gridx = 0;
		gbc_panel_FN.gridy = 1;
		panel_Main.add(panel_FN, gbc_panel_FN);
		JLabel lblFileName = new JLabel("File Name: ");
		panel_FN.add(lblFileName);
		tF_FileName = new JTextField();
		tF_FileName.setColumns(10);
		String lastFileName = config.get(ConfigId.LAST_FILE_NAME);
		tF_FileName.setText(lastFileName);
		panel_FN.add(tF_FileName);
		JPanel panel_SL = new JPanel();
		FlowLayout fl_panel_SL = (FlowLayout) panel_SL.getLayout();
		fl_panel_SL.setAlignment(FlowLayout.LEFT);
		GridBagConstraints gbc_panel_SL = new GridBagConstraints();
		gbc_panel_SL.fill = GridBagConstraints.BOTH;
		gbc_panel_SL.gridx = 0;
		gbc_panel_SL.gridy = 2;
		panel_Main.add(panel_SL, gbc_panel_SL);
		JLabel lblSaveLocation = new JLabel("Save Location: ");
		panel_SL.add(lblSaveLocation);
		tF_SaveLocation = new JTextField();
		tF_SaveLocation.setColumns(30);
		String lastSavePath = config.get(ConfigId.LAST_SAVE_PATH);
		tF_SaveLocation.setText(lastSavePath);
		panel_SL.add(tF_SaveLocation);
		btnChangeDirectory = new JButton("Change directory ...");
		btnChangeDirectory.addActionListener(e -> {
			File file = new File(tF_SaveLocation.getText());
			if (file.exists()) {
				chooser = new JFileChooser(file);
			} else {
				chooser = new JFileChooser(new File("."));
			}
			chooser.setDialogTitle(
					"Select directory where you want to save videos");
			chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			chooser.setMultiSelectionEnabled(false);
			chooser.setAcceptAllFileFilterUsed(false);
			if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
				tF_SaveLocation
						.setText(chooser.getSelectedFile().getAbsolutePath());
			}
		});
		panel_SL.add(btnChangeDirectory);
		JPanel panel_Bottom = new JPanel();
		contentPane.add(panel_Bottom, BorderLayout.SOUTH);
		btnSave = new JButton("Save");
		btnSave.addActionListener(e -> {
			String url = tF_videoURL.getText();
			String saveLoc = tF_SaveLocation.getText();
			String filename = tF_FileName.getText();
			new Thread(() -> {
				try {
					VideoDownloader.saveVideo(url, saveLoc, filename);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}).start();
		});
		panel_Bottom.add(btnSave);
		btnClose = new JButton("Close");
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
				DownloadVideoFrame.this.parentFrame.showFrame(true);
				String lastFileNameE = DownloadVideoFrame.this.tF_FileName
						.getText();
				String lastSavePathE = DownloadVideoFrame.this.tF_SaveLocation
						.getText();
				config.set(ConfigId.LAST_FILE_NAME, lastFileNameE);
				config.set(ConfigId.LAST_SAVE_PATH, lastSavePathE);
			}
			
			@Override
			public void windowActivated(WindowEvent e) {}
		});
	}
}
