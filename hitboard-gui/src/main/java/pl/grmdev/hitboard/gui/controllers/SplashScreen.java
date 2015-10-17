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
 */
public class SplashScreen implements Initializable {
	
	@FXML
	private Label lblProgress;
	@FXML
	private ProgressBar pbProgress;
	@FXML
	private ProgressIndicator piProgress;
	private static SplashScreen instance;
	
	/*
	 * (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL,
	 * java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		instance = this;
	}
	
	public SplashScreen instance() {
		return instance;
	}
}
