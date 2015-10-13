/**
 * 
 */
package pl.grmdev.hitboard.gui.controllers;

import java.net.URL;
import java.util.*;
import java.util.concurrent.ExecutionException;

import org.json.JSONException;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.transformation.SortedList;
import javafx.fxml.*;
import javafx.scene.control.*;
import pl.grmdev.hitboard.requests.RequestHandler;
/**
 * @author Levvy055
 */
public class DashBoard implements Initializable {
	
	public static DashBoard instance;
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
	private ComboBox<String> cbGames;
	@FXML
	private ComboBox<String> cbPlatforms;
	@FXML
	private ComboBox<String> cbLang;
	@FXML
	private Label lblChanges;
	@FXML
	private RadioButton rbPublic;
	@FXML
	private RadioButton rbPrivate;
	
	/*
	 * (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL,
	 * java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		instance = this;
		setupGamesList();
	}
	
	private void setupGamesList() {
		new Thread(() -> {
			try {
				cbGames.setDisable(true);
				List<String> games = RequestHandler.instance().getGames()
						.getGamesList();
				SortedList<String> gamesS = FXCollections
						.observableArrayList(games).sorted();
				Platform.runLater(() -> cbGames.setItems(gamesS));
			} catch (InterruptedException | ExecutionException
					| JSONException e) {
				e.printStackTrace();
			}
			cbGames.setDisable(false);
		}).start();
	}
}
