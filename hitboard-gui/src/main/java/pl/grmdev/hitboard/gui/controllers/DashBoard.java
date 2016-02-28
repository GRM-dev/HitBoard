/**
 * 
 */
package pl.grmdev.hitboard.gui.controllers;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import pl.grmdev.hitboard.gui.HitBoardGui;
import pl.grmdev.hitboard.gui.controllers.utils.HbNode;
import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.web.Media;
import pl.grmdev.hitboard.requests.web.User;
import pl.grmdev.hitboard.requests.web.data.MediaObject;
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
	private User user;
	
	/*
	 * (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL,
	 * java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		instance = this;
		user = RequestHandler.instance().getUser();
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
						.getGamesListNames(2900, false);
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
			user.refreshUserData();
			String userName = user.getUserName();
			String followers = user.getFollowers();
			try {
				MediaObject lo = Media.getLiveObject(userName);
				String categoryName = lo.getCategoryName();
				String mediaTitle = lo.getMediaTitle();
				tfStreamTitle.setText(mediaTitle);
				cbGames.getSelectionModel().select(categoryName);
			} catch (Exception e) {
				e.printStackTrace();
			}
			lblChannelName.setText(userName);
		}
	}
}
