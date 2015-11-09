/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import java.io.*;
import java.util.*;

import org.junit.*;

import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.web.data.*;
import pl.grmdev.hitboard.utils.FileOperation;
/**
 * @author Levvy055
 */
public class ChannelTest {
	
	private static RequestHandler reqH;
	
	@BeforeClass
	public static void init() {
		reqH = new RequestHandler("http://api.hitbox.tv/");
		File file = new File(System.getProperty("user.home")
				+ "/keystore/hb.gradle.properties");
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
		} catch (Exception e) {
			e.printStackTrace();
			fail("Error: " + e.getMessage());
		}
		finally {
			FileOperation.closeQuietly(in);
		}
	}
	
	@Test
	public void getEditorTest() {
		Editor editor = reqH.getChannel().getEditor("hitboard");
		assertThat(editor).isNotNull();
		assertThat(editor.getUserName()).isNotNull().isNotEmpty()
				.isEqualTo("Levvy");
	}
	
	@Test
	public void getEditorsTest() {
		List<Editor> editors = reqH.getChannel().getEditors("hitboard");
		assertThat(editors).isNotNull().isNotEmpty();
		assertThat(editors.get(0)).isNotNull();
		assertThat(editors.get(0).getUserName()).isNotNull().isNotEmpty();
	}
	
	@Test
	public void getHosters() {
		List<Hoster> hosters = reqH.getChannel().getHosters("hitboard");// TODO:
																		// Exception
	}
}
