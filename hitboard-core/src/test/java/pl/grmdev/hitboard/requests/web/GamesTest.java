/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.web.data.GameObject;
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
	public void getGameObjectStringTest() {
		String name = "league-of-legends";
		try {
			GameObject game = reqH.getGames().getGameObject(name);
			assertThat(game).isNotNull();
			assertThat(game.getRequest().getThis()).isNotNull().isNotEmpty();
			assertThat(game.getCategory()).isNotNull();
			assertThat(game.getCategory().getCategoryId()).isNotNull().isNotEmpty();
		}
		catch (Exception e) {
			e.printStackTrace();
			fail("Exception: " + e.getMessage());
		}
	}
	
	@Test
	public void getGameObjectIdTest() {
		int id = 2;
		try {
			GameObject game = reqH.getGames().getGameObject(id);
			assertThat(game).isNotNull();
			assertThat(game.getRequest().getThis()).isNotNull().isNotEmpty();
			assertThat(game.getCategory()).isNotNull();
			assertThat(game.getCategory().getCategoryId()).isNotNull().isNotEmpty();
		}
		catch (Exception e) {
			e.printStackTrace();
			fail("Exception: " + e.getMessage());
		}
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
