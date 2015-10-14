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
import pl.grmdev.hitboard.HitBoardCore;
import pl.grmdev.hitboard.config.*;
import pl.grmdev.hitboard.utils.Hash;
/**
 * @author Levvy055
 */
public class LoginDialog extends Dialog<Pair<String, String>> {
	
	private Node loginBtn;
	
	public LoginDialog() {
		super();
		Config config = HitBoardCore.instance().getConfig();
		setTitle("Login");
		// TODO: add graphic
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
		usernameTf.setText(config.getConfigValue(ConfigId.LOGIN_LOGIN));
		PasswordField passwordTf = new PasswordField();
		passwordTf.setPromptText("Password");
		passwordTf.setText(config.getConfigValue(ConfigId.LOGIN_PSWD));
		CheckBox cbRemLogin = new CheckBox("Remember login");
		cbRemLogin.setSelected(Boolean.parseBoolean(
				config.getConfigValue(ConfigId.LOGIN_SAVE_LOGIN)));
		CheckBox cbAutoLogin = new CheckBox("Auto Login");
		cbAutoLogin.setSelected(Boolean.parseBoolean(
				config.getConfigValue(ConfigId.LOGIN_AUTO_LOGIN)));
		grid.add(new Label("Username: "), 0, 0);
		grid.add(usernameTf, 1, 0);
		grid.add(new Label("Password: "), 0, 1);
		grid.add(passwordTf, 1, 1);
		grid.add(cbRemLogin, 0, 2);
		grid.add(cbAutoLogin, 1, 2);
		loginBtn = dialogPane.lookupButton(loginButtonType);
		loginBtn.setDisable(true);
		ChangeListener<String> logBtnListener = (observable, oldValue,
				newValue) -> {
			String u = usernameTf.getText();
			String p = passwordTf.getText();
			if (!u.isEmpty() && u.length() >= 3 && !p.isEmpty()
					&& p.length() >= 5 && !p.equals(u)) {
				loginBtn.setDisable(false);
			} else {
				loginBtn.setDisable(true);
			}
		};
		usernameTf.textProperty().addListener(logBtnListener);
		passwordTf.textProperty().addListener(logBtnListener);
		dialogPane.setContent(grid);
		setResultConverter(dialogBtn -> {
			config.setConfigValue(ConfigId.LOGIN_SAVE_LOGIN,
					cbRemLogin.isSelected() ? "true" : "false");
			config.setConfigValue(ConfigId.LOGIN_AUTO_LOGIN,
					cbAutoLogin.isSelected() ? "true" : "false");
			if (dialogBtn == loginButtonType) {
				config.setConfigValue(ConfigId.LOGIN_LOGIN,
						cbRemLogin.isSelected() ? usernameTf.getText() : "");
				config.setConfigValue(ConfigId.LOGIN_PSWD,
						cbAutoLogin.isSelected()
								? Hash.hash(passwordTf.getText())
								: "");
				return new Pair<String, String>(usernameTf.getText(),
						passwordTf.getText());
			} else {
				return new Pair<String, String>("", "");
			}
		});
		Platform.runLater(() -> usernameTf.requestFocus());
	}
	
	/**
	 * @param badPass
	 */
	public void badPassword(boolean badPass) {
		setHeaderText("Please login to continue."
				+ (badPass ? "\nBad username/password" : ""));
	}
}
