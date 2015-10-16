/**
 * 
 */
package pl.grmdev.hitboard.gui.controllers;

import java.net.URL;
import java.util.*;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.transformation.SortedList;
import javafx.fxml.*;
import javafx.scene.control.*;
import pl.grmdev.hitboard.gui.HitBoardGui;
import pl.grmdev.hitboard.gui.controllers.utils.HbNode;
import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.web.User;
/**
 * @author Levvy055
 */
public class DashBoard implements Initializable, HbNode {
	
	private static DashBoard instance;
	@FXML
	private Label lblChannelName;
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
		btnShowChannel.setOnAction(event -> {
			HitBoardGui.instance().getHitBoardFx().getHostServices()
					.showDocument(
							"http://hitbox.tv/" + lblChannelName.getText());
		});
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
			} catch (Exception e) {
				e.printStackTrace();
			}
			cbGames.setDisable(false);
		}).start();
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.gui.HbNode#updateAll()
	 */
	@Override
	public void updateAll() {
		User user = RequestHandler.instance().getUser();
		if (user != null) {
			String userName = user.getUserName();
			String followers = user.getFollowers();
			lblChannelName.setText(userName);
		}
	}
}
