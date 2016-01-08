/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Map;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.Test;

import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.web.data.ChannelStats;
import pl.grmdev.hitboard.requests.web.data.Country;
/**
 * @author Levvy055
 */
import pl.grmdev.hitboard.utils.FileOperation;
public class StatsTest {
	
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
	public void getChannelStatsTest() {
		ChannelStats channelStats = reqH.getStatistics().getChannelStats("hitboard", new Date(100000000), new Date());
		assertThat(channelStats).isNotNull();
		assertThat(channelStats.getChannel()).isNotNull();
		Map<String, Country> countries = channelStats.getCountries();
		assertThat(countries).isNotNull();
		Country country = countries.get("PL");
		assertThat(country).isNotNull();
		assertThat(country.getViews()).isGreaterThan(0);
	}
}
