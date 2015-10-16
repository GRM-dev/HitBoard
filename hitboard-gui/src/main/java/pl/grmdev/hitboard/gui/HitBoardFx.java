package pl.grmdev.hitboard.gui;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Pair;
import pl.grmdev.hitboard.HitBoardCore;
import pl.grmdev.hitboard.gui.controllers.MainForm;
import pl.grmdev.hitboard.gui.controllers.utils.HbNode;
import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.web.Token;
public class HitBoardFx extends Application {
	
	private Stage primaryStage;
	private static boolean launched;
	private boolean cancelledOrLogged;
	private boolean badPass;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		HitBoardGui.instance().setStreamManager(this);
		Platform.setImplicitExit(false);
		setUserAgentStylesheet(STYLESHEET_MODENA);
		Parent root;
		try {
			URL mFormResUrl = getClass().getResource("/views/MainForm.fxml");
			root = FXMLLoader.load(mFormResUrl);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("HitBoard - (HitBox hitter)");
		primaryStage.sizeToScene();
		primaryStage.setOnCloseRequest(event -> {
			event.consume();
			closeWindow();
		});
		primaryStage.centerOnScreen();
		Platform.runLater(() -> showLoginDialog());
	}
	
	public void showLoginDialog() {
		try {
			LoginDialog dialog = new LoginDialog();
			showWindow(false);
			boolean connected = HitBoardCore.instance().getRequestHandler()
					.hasConnection();
			MainForm.instance.getStateCircle()
					.setFill(connected ? Color.GREEN : Color.RED);
			if (connected) {
				cancelledOrLogged = false;
				badPass = false;
				Token token = RequestHandler.instance().getToken();
				while (!cancelledOrLogged) {
					dialog.badPassword(badPass);
					Optional<Pair<String, String>> result = dialog
							.showAndWait();
					badPass = false;
					result.ifPresent(res -> {
						String u = res.getKey();
						String p = res.getValue();
						if (u.isEmpty()) {
							closeWindow();
							cancelledOrLogged = true;
						} else {
							try {
								if (token.genAuthToken(u, p)) {
									token.applyUser();
									cancelledOrLogged = true;
									showWindow(true);
									Platform.runLater(() -> {
										HbNode currentNode;
										try {
											currentNode = MainForm.instance
													.getCurrentNode();
											if (currentNode == null) {
												System.out.println(
														"current node null!");
											} else {
												currentNode.updateAll();
											}
										} catch (Exception e) {
											e.printStackTrace();
										}
									});
								} else {
									badPass = true;
								}
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
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
	
	/**
	 * Opens Stream Manager. Called only at first time use.
	 */
	public static void openManager() {
		if (!launched) {
			launch();
		}
	}
	
	private void closeWindow() {
		showWindow(false);
		HitBoardGui.instance().getActionSelectionFrame().showFrame(true);
	}
	
	public void showWindow(boolean show) {
		if (show) {
			primaryStage.show();
		} else {
			primaryStage.hide();
		}
	}
}
