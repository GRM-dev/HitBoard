/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.Test;

import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.utils.FileOperation;
/**
 * @author Levvy055
 */
public class TokenTest {
	
	private static RequestHandler reqH;
	
	@BeforeClass
	public static void init() {
		reqH = new RequestHandler("http://api.hitbox.tv/");
	}
	
	@Test
	public void getTokenTest() {
		Token token = reqH.getToken();
		assertThat(token).isNotNull();
		File file = new File(System.getProperty("user.home") + "/keystore/hb.gradle.properties");
		assertThat(file.exists()).isTrue();
		Properties props = new Properties();
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			props.load(in);
			String u = props.getProperty("hb_username");
			String p = props.getProperty("hb_password");
			assertThat(u).isNotNull().isNotEmpty();
			assertThat(p).isNotNull().isNotEmpty();
			boolean tokenGen = token.genAuthToken(u, p);
			assertThat(tokenGen).isTrue();
			assertThat(token.getToken()).isNotNull().isNotEmpty();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			FileOperation.closeQuietly(in);
		}
	}
	
	@Test
	public void applyUserTest() {
		Token token = reqH.getToken();
		File file = new File(System.getProperty("user.home") + "/keystore/hb.gradle.properties");
		Properties props = new Properties();
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			props.load(in);
			String u = props.getProperty("hb_username");
			String p = props.getProperty("hb_password");
			if (token.genAuthToken(u, p)) {
				boolean applyUser = token.applyUser();
				assertThat(applyUser).isTrue();
				assertThat(reqH.getUser()).isNotNull();
			} else {
				fail("Token not generated");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			FileOperation.closeQuietly(in);
		}
	}
	
	@Test
	public void validateTokenTest() {
		Token token = reqH.getToken();
		File file = new File(System.getProperty("user.home") + "/keystore/hb.gradle.properties");
		Properties props = new Properties();
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			props.load(in);
			String u = props.getProperty("hb_username");
			String p = props.getProperty("hb_password");
			if (token.genAuthToken(u, p)) {
				String tokenString = token.getToken();
				boolean valid = token.validateToken(tokenString);
				assertThat(valid).isTrue();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			FileOperation.closeQuietly(in);
		}
	}
	
	@Test
	public void usernameFromTokenTest() {
		Token token = reqH.getToken();
		File file = new File(System.getProperty("user.home") + "/keystore/hb.gradle.properties");
		Properties props = new Properties();
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			props.load(in);
			String u = props.getProperty("hb_username");
			String p = props.getProperty("hb_password");
			if (token.genAuthToken(u, p)) {
				String tokenString = token.getToken();
				String username = token.getUsernameFromToken(tokenString);
				assertThat(username).isNotNull().isNotEmpty().isEqualTo("HitBoard");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			FileOperation.closeQuietly(in);
		}
	}
}
