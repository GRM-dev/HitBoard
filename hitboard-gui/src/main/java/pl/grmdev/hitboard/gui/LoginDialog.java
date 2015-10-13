/**
 * 
 */
package pl.grmdev.hitboard.gui;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.layout.GridPane;
import javafx.util.Pair;
/**
 * @author Levvy055
 */
public class LoginDialog extends Dialog<Pair<String, String>> {
	
	private boolean authListening;
	private Node loginBtn;
	
	public LoginDialog() {
		setTitle("Login");
		setHeaderText("Please login to continue");
		// setGraphic(new
		// ImageView(this.getClass().getResource("login.png").toString()));
		ButtonType loginButtonType = new ButtonType("Login",
				ButtonData.OK_DONE);
		DialogPane dialogPane = getDialogPane();
		dialogPane.getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(20, 150, 10, 10));
		TextField usernameTf = new TextField();
		usernameTf.setPromptText("Username");
		PasswordField passwordTf = new PasswordField();
		passwordTf.setPromptText("Password");
		grid.add(new Label("Username: "), 0, 0);
		grid.add(usernameTf, 1, 0);
		grid.add(new Label("Password: "), 0, 1);
		grid.add(passwordTf, 1, 1);
		loginBtn = dialogPane.lookupButton(loginButtonType);
		loginBtn.setDisable(true);
		ChangeListener<? super String> logBtnListener = (observable, oldValue,
				newValue) -> {
			if (!authListening) {
				String u = usernameTf.getText();
				String p = passwordTf.getText();
				if (!u.isEmpty() && u.length() >= 3 && !p.isEmpty()
						&& p.length() >= 5 && !p.equals(u)) {
					auth(u, p);
				} else {
					loginBtn.setDisable(true);
				}
			}
		};
		usernameTf.textProperty().addListener(logBtnListener);
		passwordTf.textProperty().addListener(logBtnListener);
		dialogPane.setContent(grid);
		setResultConverter(dialogBtn -> {
			if (dialogBtn == loginButtonType) {
				return new Pair<String, String>(usernameTf.getText(),
						passwordTf.getText());
			} else {
				return new Pair<String, String>("", "");
			}
		});
		Platform.runLater(() -> usernameTf.requestFocus());
	}
	
	private synchronized void auth(String u, String p) {
		authListening = true;
		try {
			loginBtn.setDisable(u.trim().isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			authListening = false;
		}
	}
}
