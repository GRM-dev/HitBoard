/**
 * 
 */
package pl.grmdev.hitboard.gui.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.concurrent.Task;
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
		restartProgress(getNewTask());
	}
	
	public void restartProgress(Task<Boolean> task) {
		pbProgress.progressProperty().unbind();
		pbProgress.progressProperty().bind(task.progressProperty());
		task.messageProperty().addListener((ChangeListener<String>) (observable,
				oldValue, newValue) -> System.out.println(newValue));
	}
	
	private Task<Boolean> getNewTask() {
		return new Task<Boolean>() {
			
			@Override
			protected Boolean call() throws Exception {
				return false;
			}
		};
	}
	
	public static SplashScreen instance() {
		return instance;
	}
}
