package pl.grmdev.hitboard.gui;

import java.io.IOException;
import java.net.URL;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

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
		primaryStage.sizeToScene();
		primaryStage.show();
		primaryStage.setOnCloseRequest(event -> {
			event.consume();
			show(false);
			HitBoardGui.instance().getActionSelectionFrame().showFrame(true);
		});
	}

	/**
	 * 
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
