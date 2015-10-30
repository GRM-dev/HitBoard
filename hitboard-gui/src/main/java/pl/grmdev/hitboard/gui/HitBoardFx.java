package pl.grmdev.hitboard.gui;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;

import com.fasterxml.jackson.core.JsonParseException;
import com.mashape.unirest.http.exceptions.UnirestException;

import javafx.application.*;
import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.stage.*;
import javafx.util.Pair;
import pl.grmdev.hitboard.HitBoardCore;
import pl.grmdev.hitboard.gui.controllers.*;
import pl.grmdev.hitboard.gui.controllers.utils.HbNode;
import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.web.Token;
public class HitBoardFx extends Application {
	
	private Stage stage;
	private static boolean launched;
	private boolean cancelledOrLogged;
	private boolean badPass;
	private Scene rootScene;
	private Scene splashScreenScene;
	private Stage rootStage;
	private Stage splashStage;
	private Task<Boolean> task;
	protected boolean loading;
	
	@Override
	public void start(Stage primaryStage) {
		this.stage = primaryStage;
		this.splashStage = primaryStage;
		HitBoardGui.instance().setStreamManager(this);
		Platform.setImplicitExit(false);
		setUserAgentStylesheet(STYLESHEET_MODENA);
		try {
			URL splashScreenUrl = getClass()
					.getResource("/views/SplashScreen.fxml");
			Parent splashRoot = FXMLLoader.load(splashScreenUrl);
			splashScreenScene = new Scene(splashRoot);
			splashScreenScene.setFill(Color.TRANSPARENT);
			stage.initStyle(StageStyle.TRANSPARENT);
			stage.setScene(splashScreenScene);
			URL mFormResUrl = getClass().getResource("/views/MainForm.fxml");
			Parent root = FXMLLoader.load(mFormResUrl);
			rootScene = new Scene(root);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		stage.setTitle("HitBoard Loading ...");
		stage.sizeToScene();
		stage.setOnCloseRequest(event -> {
			event.consume();
			closeWindow();
		});
		primaryStage.centerOnScreen();
		showWindow(true);
		task = new Task<Boolean>() {
			
			@Override
			protected Boolean call() throws Exception {
				while (loading) {
					updateProgress(20, 100);
				}
				return false;
			}
		};
		loading = true;
		SplashScreen.instance().restartProgress(task);
		showLoginDialog();
	}
	
	public void showLoginDialog() {
		try {
			LoginDialog dialog = new LoginDialog();
			boolean connected = HitBoardCore.instance().getRequestHandler()
					.hasConnection();
			MainForm.instance.getStateCircle()
					.setFill(connected ? Color.GREEN : Color.RED);
			if (connected) {
				badPass = false;
				Token token = RequestHandler.instance().getToken();
				if (stage != splashStage) {
					showWindow(false);
					stage = splashStage;
				}
				showWindow(true);
				cancelledOrLogged = false;
				SplashScreen.instance().restartProgress(task);
				while (!cancelledOrLogged) {
					getAndCheckLogin(dialog, token);
				}
			} else {
				System.out.println("No connection");
				closeWindow();
			}
		} catch (Exception e) {
			e.printStackTrace();
			closeWindow();
		}
	}
	
	private void getAndCheckLogin(LoginDialog dialog, Token token) {
		dialog.setBadPasswordInfo(badPass);
		Optional<Pair<String, String>> result = dialog.showAndWait();
		badPass = false;
		result.ifPresent(res -> {
			String u = res.getKey();
			String p = res.getValue();
			if (!u.isEmpty()) {
				try {
					if (token.genAuthToken(u, p)) {
						loadAndShowWindow(token);
					} else {
						badPass = true;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				closeWindow();
				cancelledOrLogged = true;
			}
		});
	}
	
	private void loadAndShowWindow(Token token)
			throws UnirestException, JsonParseException, IOException {
		token.applyUser();
		cancelledOrLogged = true;
		rootStage = new Stage();
		rootStage.setScene(rootScene);
		rootStage.initStyle(StageStyle.DECORATED);
		rootStage.setTitle("HitBoard - <HitBox hitter>");
		rootStage.sizeToScene();
		rootStage.setOnCloseRequest(event -> {
			event.consume();
			closeWindow();
		});
		showWindow(false);
		stage = rootStage;
		showWindow(true);
		Platform.runLater(() -> {
			HbNode currentNode;
			try {
				currentNode = MainForm.instance.getCurrentNode();
				if (currentNode == null) {
					System.out.println("current node null!");
				} else {
					currentNode.updateAll();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
	
	/**
	 * Opens Stream Manager. Called only at first time use.
	 */
	public static void launchStreamManager() {
		if (!launched) {
			new Thread(() -> launch()).start();;
		}
	}
	
	private void closeWindow() {
		showWindow(false);
		HitBoardGui.instance().getActionSelectionFrame().showFrame(true);
	}
	
	public void showWindow(boolean show) {
		if (show) {
			stage.show();
		} else {
			stage.hide();
		}
	}
}
