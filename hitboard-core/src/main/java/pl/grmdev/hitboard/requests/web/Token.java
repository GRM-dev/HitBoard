/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import java.io.IOException;

import org.json.*;

import com.fasterxml.jackson.core.JsonParseException;
import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.BaseRequest;

import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.util.*;
/**
 * @author Levvy055
 */
public class Token {
	
	private char[] token;
	
	public boolean genAuthToken(String username, String password)
			throws UnirestException, JsonParseException, IOException,
			JSONException {
		Params params = new Params().p("login", username).p("pass", password);
		BaseRequest postReq = RequestHandler.instance().post(HbPost.TOKEN_GET,
				params);
		HttpResponse<JsonNode> httpResponse = postReq.asJson();
		JsonNode jsonNode = httpResponse.getBody();
		JSONObject jsonObject = jsonNode.getObject();
		if (jsonObject.has("authToken")) {
			String tokenS = jsonObject.getString("authToken");
			if (tokenS != null && tokenS.length() > 12) {
				this.token = tokenS.toCharArray();
				return true;
			}
		}
		return false;
	}
	
	public boolean applyUser()
			throws UnirestException, JsonParseException, IOException {
		if (token == null) {
			return false;
		}
		BaseRequest postM = RequestHandler.instance().post(HbPost.TOKEN_AUTH,
				new Params().p("authToken", new String(token)));
		HttpResponse<JsonNode> httpResponse = postM.asJson();
		JsonNode jsonNode = httpResponse.getBody();
		JSONObject jsonObject = jsonNode.getObject();
		com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
		User user = objectMapper.readValue(jsonObject.toString(), User.class);
		if (user != null) {
			RequestHandler.instance().setUser(user);
			return true;
		}
		return false;
	}
}
