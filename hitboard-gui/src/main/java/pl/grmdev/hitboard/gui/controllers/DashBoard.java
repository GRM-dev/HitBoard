/**
 * 
 */
package pl.grmdev.hitboard.gui.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.*;
import javafx.scene.control.*;

/**
 * @author Levvy055
 *
 */
public class DashBoard implements Initializable {

	@FXML
	private Label LblChannelName;
	@FXML
	private Button btnShowChannel;
	@FXML
	private Button btnSave;
	@FXML
	private Button btnRefresh;
	@FXML
	private TextField tfStreamTitle;
	@FXML
	private ComboBox<?> cbGames;
	@FXML
	private ComboBox<?> cbPlatforms;
	@FXML
	private ComboBox<?> cbLang;
	@FXML
	private Label lblChanges;
	@FXML
	private RadioButton rbPublic;
	@FXML
	private RadioButton rbPrivate;

	/*
	 * (non-Javadoc)
	 * 
	 * @see javafx.fxml.Initializable#initialize(java.net.URL,
	 * java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
