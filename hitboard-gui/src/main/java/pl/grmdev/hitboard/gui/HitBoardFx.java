package pl.grmdev.hitboard.gui;

import java.io.IOException;
import java.net.URL;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import pl.grmdev.hitboard.HitBoardCore;
import pl.grmdev.hitboard.config.ConfigId;
import pl.grmdev.hitboard.gui.controllers.MainForm;
public class HitBoardFx extends Application {
	
	private Stage primaryStage;
	private static boolean launched;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		HitBoardGui.instance().setStreamManager(this);
		Platform.setImplicitExit(false);
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
			show(false);
			HitBoardGui.instance().getActionSelectionFrame().showFrame(true);
		});
		primaryStage.setOnShown(event -> {
			Platform.runLater(() -> showStartAlert());
		});
		primaryStage.show();
	}
	
	public void showStartAlert() {
		try {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Welcome");
			alert.setHeaderText("To change setting you need to be logged in.");
			alert.setContentText("Please log in");
			alert.showAndWait();
			boolean con = HitBoardCore.instance().getRequestHandler()
					.hasConnection();
			MainForm.instance.getStateCircle()
					.setFill(con ? Color.GREEN : Color.RED);
		} catch (Exception e) {
			e.printStackTrace();
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
	
	public void show(boolean show) {
		if (show) {
			primaryStage.show();
		} else {
			primaryStage.hide();
		}
	}
}
