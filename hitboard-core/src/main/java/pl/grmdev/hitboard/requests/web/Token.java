/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import java.io.IOException;

import org.json.JSONObject;

import com.fasterxml.jackson.core.*;
import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequestWithBody;

import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.util.HbPost;
/**
 * @author Levvy055
 */
public class Token {
	
	private char[] token;
	
	public boolean genAuthToken(String username, String password)
			throws UnirestException, JsonParseException, IOException {
		HttpResponse<JsonNode> httpResponse = RequestHandler.instance()
				.post(HbPost.TOKEN_GET).queryString("username", username)
				.queryString("password", password).asJson();
		JsonNode jsonNode = httpResponse.getBody();
		JSONObject jsonObject = jsonNode.getObject();
		JsonFactory factory = new JsonFactory();
		JsonParser parser = factory.createParser(jsonObject.toString());
		if (parser.canReadTypeId()) {
			Object token = parser.getObjectId();
		}
		return false;
	}
	
	public User getUser()
			throws UnirestException, JsonParseException, IOException {
		HttpRequestWithBody postM = RequestHandler.instance()
				.post(HbPost.TOKEN_AUTH);
		HttpResponse<JsonNode> httpResponse = postM
				.queryString("username", token).asJson();
		JsonNode jsonNode = httpResponse.getBody();
		JSONObject jsonObject = jsonNode.getObject();
		JsonFactory factory = new JsonFactory();
		JsonParser parser = factory.createParser(jsonObject.toString());
		if (parser.canReadTypeId()) {
			User user = (User) parser.getObjectId();
		}
		return null;
	}
}
