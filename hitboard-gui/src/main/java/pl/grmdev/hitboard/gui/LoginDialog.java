/**
 * 
 */
package pl.grmdev.hitboard.gui;

import java.util.Arrays;
import java.util.logging.Logger;
import java.util.prefs.Preferences;

import org.apache.commons.lang3.ArrayUtils;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.layout.GridPane;
import javafx.util.*;
import pl.grmdev.hitboard.HitBoardCore;
import pl.grmdev.hitboard.config.*;
import pl.grmdev.hitboard.utils.Hash;
/**
 * @author Levvy055
 */
public class LoginDialog extends Dialog<Pair<String, String>> {
	
	private Node loginBtn;
	private TextField usernameTf;
	private PasswordField passwordTf;
	private Logger logger;
	
	public LoginDialog() {
		super();
		Config config = HitBoardCore.instance().getConfig();
		Preferences root = Preferences.userNodeForPackage(HitBoardCore.class);
		setTitle("Login");
		logger = HitBoardCore.getLogger();
		// TODO: add graphic
		// setGraphic(new
		// ImageView(this.getClass().getResource("login.png").toString()));
		DialogPane dialogPane = getDialogPane();
		ButtonType loginButtonType = new ButtonType("Login",
				ButtonData.OK_DONE);
		dialogPane.getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);
		usernameTf = new TextField();
		usernameTf.setPromptText("Username");
		usernameTf.setText(config.get(ConfigId.LOGIN_LOGIN));
		passwordTf = new PasswordField();
		passwordTf.setPromptText("Password");
		CheckBox cbRemLogin = new CheckBox("Remember login");
		CheckBox cbAutoLogin = new CheckBox("Auto Login");
		try {
			byte[] pass1 = config.get(ConfigId.LOGIN_PSWD);
			byte[] iv = config.get(ConfigId.LOGIN_IV);
			if (pass1 != null && iv != null && iv.length == 8) {
				byte[] pass2 = root.getByteArray(ConfigId.LOGIN_PSWD.toString(),
						null);
				if (pass1 != null && pass2 != null) {
					byte[] pswd = ArrayUtils.addAll(pass1, pass2);
					if (pswd.length % 8 == 0) {
						Hash hash = new Hash(iv);
						byte[] decrypted = hash.decrypt(pswd);
						String pswdD = new String(decrypted, "Cp1252");
						passwordTf.setText(pswdD);
					}
				}
			}
			cbRemLogin.setSelected(config.get(ConfigId.LOGIN_SAVE_LOGIN));
			cbAutoLogin.setSelected(config.get(ConfigId.LOGIN_AUTO_LOGIN));
		} catch (Exception e) {
			logger.warning("Possible config corrupted.\n" + e.getMessage());
		}
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(20, 150, 10, 10));
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
			unlockBtn();
		};
		usernameTf.textProperty().addListener(logBtnListener);
		passwordTf.textProperty().addListener(logBtnListener);
		dialogPane.setContent(grid);
		Callback<ButtonType, Pair<String, String>> loginConverter = dialogBtn -> {
			config.set(ConfigId.LOGIN_SAVE_LOGIN,
					cbRemLogin.isSelected() ? "true" : "false");
			config.set(ConfigId.LOGIN_AUTO_LOGIN,
					cbAutoLogin.isSelected() ? "true" : "false");
			if (dialogBtn == loginButtonType) {
				config.set(ConfigId.LOGIN_LOGIN,
						cbRemLogin.isSelected() ? usernameTf.getText() : "");
				try {
					Hash hash = new Hash();
					byte[] encryptedPswd = hash
							.encrypt(passwordTf.getText().getBytes("Cp1252"));
					byte[] p1 = Arrays.copyOfRange(encryptedPswd, 0, 6);
					byte[] p2 = Arrays.copyOfRange(encryptedPswd, 6,
							encryptedPswd.length);
					config.set(ConfigId.LOGIN_PSWD,
							cbAutoLogin.isSelected() ? p1 : "");
					config.set(ConfigId.LOGIN_IV,
							cbAutoLogin.isSelected() ? hash.getIV() : "");
					root.putByteArray(ConfigId.LOGIN_PSWD.toString(), p2);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return new Pair<String, String>(usernameTf.getText(),
						passwordTf.getText());
			} else {
				return new Pair<String, String>("", "");
			}
		};
		setResultConverter(loginConverter);
		setOnShown(event -> {
			Platform.runLater(() -> {
				if ((boolean) config.get(ConfigId.LOGIN_AUTO_LOGIN)) {
					unlockBtn();
					loginConverter.call(loginButtonType);
					System.out.println("click///");
				}
				usernameTf.requestFocus();
				event.consume();
			});
		});
	}
	
	private void unlockBtn() {
		String u = usernameTf.getText();
		String p = passwordTf.getText();
		if (!u.isEmpty() && u.length() >= 3 && !p.isEmpty() && p.length() >= 5
				&& !p.equals(u)) {
			loginBtn.setDisable(false);
		} else {
			loginBtn.setDisable(true);
		}
	}
	
	/**
	 * @param badPass
	 */
	public void badPassword(boolean badPass) {
		setHeaderText("Please login to continue."
				+ (badPass ? "\nBad username/password" : ""));
	}
}
