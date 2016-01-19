/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.Test;

import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.web.data.Follower;
import pl.grmdev.hitboard.requests.web.data.FollowingStatus;
import pl.grmdev.hitboard.requests.web.data.SortType;
import pl.grmdev.hitboard.utils.FileOperation;
/**
 * @author Levvy055
 */
public class FollowersTest {
	
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
	public void getFollowersTest() {
		String channel = "hitboard";
		int offset = 0;
		int limit = 100;
		boolean reverse = false;
		SortType sort = SortType.DATE_ADDED;
		try {
			List<Follower> followers = reqH.getFollowers().getFollowers(channel, offset, limit, reverse, sort);
			assertThat(followers).isNotNull().isNotEmpty();
		}
		catch (Exception e) {
			e.printStackTrace();
			fail("Error: " + e.getMessage());
		}
	}
	
	@Test
	public void getFollowedChannelsTest() {
		String channel = "hitboard";
		int offset = 0;
		int limit = 100;
		boolean reverse = false;
		SortType sort = SortType.DATE_ADDED;
		try {
			List<Follower> followers = reqH.getFollowers().getFollowedChannels(channel, offset, limit, reverse, sort);
			assertThat(followers).isNotNull().isNotEmpty();
		}
		catch (Exception e) {
			e.printStackTrace();
			fail("Error: " + e.getMessage());
		}
	}
	
	@Test
	public void getFollowingStatus() {
		String channel = "hitboard";
		String username = "Levvy";
		try {
			FollowingStatus followingStatus = reqH.getFollowers().getFollowingStatus(channel, username);
			assertThat(followingStatus).isNotNull();
		}
		catch (Exception e) {
			e.printStackTrace();
			fail("Error: " + e.getMessage());
		}
	}
	
}
