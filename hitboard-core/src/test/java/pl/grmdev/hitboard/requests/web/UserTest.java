/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.json.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;

import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.web.data.IUserUpdateData;
import pl.grmdev.hitboard.requests.web.data.UserData;
import pl.grmdev.hitboard.utils.FileOperation;
/**
 * @author Levvy055
 */
public class UserTest {
	
	private static RequestHandler reqH;
	
	@BeforeClass
	public static void init() {
		reqH = new RequestHandler("http://api.hitbox.tv/");
		File file = new File(System.getProperty("user.home") + "/keystore/hb.gradle.properties");
		Token token = reqH.getToken();
		Properties props = new Properties();
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			props.load(in);
			String u = props.getProperty("hb_username");
			String p = props.getProperty("hb_password");
			if (!token.genAuthToken(u, p)) {
				fail("Token not generated");
			}
			String tokenS = token.getToken();
			assertThat(tokenS).isNotNull().isNotEmpty();
			assertThat(token.applyUser()).isTrue();
		}
		catch (Exception e) {
			e.printStackTrace();
			fail("Error: " + e.getMessage());
		}
		finally {
			FileOperation.closeQuietly(in);
		}
	}
	
	@Test
	public void getUserTest() {
		UserData user = reqH.getUser().getUser("hitboard");
		assertThat(user).isNotNull();
		assertThat(user.getUserName()).isNotNull().isNotEmpty();
	}
	
	@Test
	public void updateUserTest() {
		IUserUpdateData user = reqH.getUser().getUser("hitboard");
		new JSONObject(user);
		try {
			reqH.getUser().updateUser("hitboard", user);
		}
		catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
