/**
 * 
 */
package pl.grmdev.hitboard.requests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

import org.json.JSONArray;
import org.junit.*;

import com.mashape.unirest.http.*;
import com.mashape.unirest.request.GetRequest;

import pl.grmdev.hitboard.requests.util.HbGet;
/**
 * @author Levvy055
 */
public class RequestHandlerTest {
	
	private static RequestHandler reqH;
	
	@BeforeClass
	public static void init() {
		reqH = new RequestHandler("http://api.hitbox.tv/");
	}
	
	@Test
	public void initTest() {
		assertThat(reqH).isNotNull();
		assertThat(RequestHandler.instance()).isNotNull();
	}
	
	@Test
	public void getRequestTest() {
		try {
			GetRequest getResultRequest = reqH.get(HbGet.CHAT_SERVERS);
			assertThat(getResultRequest).isNotNull();
			HttpResponse<JsonNode> jsonResp = getResultRequest.asJson();
			assertThat(jsonResp).isNotNull();
			JsonNode jsonNode = jsonResp.getBody();
			assertThat(jsonNode).isNotNull();
			JSONArray jsonArray = jsonNode.getArray();
			assertThat(jsonArray).isNotNull();
			assertThat(jsonArray.length()).isNotEqualTo(0);
		} catch (Exception e) {
			fail("There was exception!", e);
		}
	}
	
	@Test
	public void hasConnectionTest() {
		assertThat(reqH.hasConnection()).isTrue();
	}
}
