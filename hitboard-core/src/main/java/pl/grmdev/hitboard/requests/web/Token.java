/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import org.json.JSONObject;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.request.BaseRequest;
import com.mashape.unirest.request.GetRequest;

import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.util.HbGet;
import pl.grmdev.hitboard.requests.util.HbPost;
import pl.grmdev.hitboard.requests.util.Params;
/**
 * @author Levvy055
 */
public class Token {
	
	private char[] token;
	
	public boolean genAuthToken(String username, String password)
			throws Exception {
		Params params = new Params().p("login", username).p("pass", password);
		BaseRequest postReq = RequestHandler.instance().post(HbPost.TOKEN_GET, null, params);
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
	
	public boolean applyUser() throws Exception {
		if (token == null) {
			return false;
		}
		BaseRequest postM = RequestHandler.instance().post(HbPost.TOKEN_AUTH, null, new Params().p("authToken", new String(token)));
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
	
	public boolean hasToken() {
		return token != null;
	}
	
	public String getToken() {
		return new String(token);
	}
	
	public boolean validateToken(String token) throws Exception {
		if(token==null){
			if ((token = RequestHandler.instance().getToken().getToken()) == null) { throw new Exception("No token available."); }
		}
		GetRequest request = RequestHandler.instance().get(HbGet.TOKEN_VALID, new Params().p("token", new String(token)));
		HttpResponse<JsonNode> response = request.asJson();
		JSONObject jobj = response.getBody().getObject();
		if (jobj.getBoolean("success")) {
			if (jobj.getString("error_msg").equals("logged_in")) {
				return true;
			}
			else {
				return false;
			}
		}
		if (jobj.getBoolean("error")) {
			throw new Exception(jobj.getString("error_msg"));
		}
		else {
			return false;
		}
	}
	
	public String getUsernameFromToken(String token) throws Exception {
		if (token == null) {
			if ((token = RequestHandler.instance().getToken().getToken()) == null) { throw new Exception("No token available."); }
		}
		GetRequest request = RequestHandler.instance().get(HbGet.TOKEN_USER_FROM_TOKEN, new String(token));
		HttpResponse<JsonNode> response = request.asJson();
		JSONObject jobj = response.getBody().getObject();
		return jobj.getString("user_name");
	}
}
