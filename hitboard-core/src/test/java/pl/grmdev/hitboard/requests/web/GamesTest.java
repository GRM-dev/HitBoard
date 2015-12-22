/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.*;

import pl.grmdev.hitboard.requests.RequestHandler;
/**
 * @author Levvy055
 */
public class GamesTest {
	
	private static RequestHandler reqH;
	
	@BeforeClass
	public static void init() {
		reqH = new RequestHandler("http://api.hitbox.tv/");
	}
	
	@Test
	public void getGamesNamesList(){
		List<String> gamesListNames;
		try {
			gamesListNames = reqH.getGames().getGamesListNames(1000, false);
			assertThat(gamesListNames).isNotNull().isNotEmpty();
		} catch (Exception e) {
			e.printStackTrace();
			fail("Exception: " + e.getMessage());
		}
		
	}
}
