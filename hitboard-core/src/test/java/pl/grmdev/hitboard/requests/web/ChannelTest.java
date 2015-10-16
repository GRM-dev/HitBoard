/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import org.junit.BeforeClass;

import pl.grmdev.hitboard.requests.RequestHandler;
/**
 * @author Levvy055
 */
public class ChannelTest {
	
	private static RequestHandler reqH;
	
	@BeforeClass
	public static void init() {
		reqH = new RequestHandler("http://api.hitbox.tv/");
	}
}
