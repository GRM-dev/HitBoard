/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.HttpRequest;

import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.util.HbGet;
import pl.grmdev.hitboard.requests.util.Params;
import pl.grmdev.hitboard.requests.web.data.GameObject;
/**
 * @author Levvy055
 */
public class Games {
	
	public GameObject getGameObject(String name) throws Exception {
		Params p = new Params().p("seo", true);
		GetRequest request = RequestHandler.instance().get(HbGet.GAMES_GAME, p, name.trim().replace(" ", "-"));
		JsonNode node = request.asJson().getBody();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
		GameObject gameObject = objectMapper.readValue(node.toString(), GameObject.class);
		return gameObject;
	}
	
	public GameObject getGameObject(int id) throws Exception {
		Params p = new Params().p("seo", false);
		GetRequest request = RequestHandler.instance().get(HbGet.GAMES_GAME, p, id + "");
		JsonNode node = request.asJson().getBody();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
		GameObject gameObject = objectMapper.readValue(node.toString(), GameObject.class);
		return gameObject;
	}
	
	/**
	 * Gets list of games available on hitbox.tv
	 * 
	 * @param limit
	 *            limit of list elements
	 * @param liveOnly
	 *            shows only live games
	 * @param keywords
	 *            show games with this keywords
	 * @return {@link List} of games names
	 * @throws Exception
	 */
	public List<String> getGamesListNames(int limit, boolean liveOnly,
			String... keywords) throws Exception {
		RequestHandler req = RequestHandler.instance();
		Params p = new Params().p("limit", limit).p("liveonly", liveOnly);
		if (keywords != null && keywords.length > 0) {
			StringBuilder sb = new StringBuilder();
			for (String key : keywords) {
				sb.append(key);
			}
			p = p.p("q", sb.toString());
		}
		HttpRequest request = req.get(HbGet.GAMES_LIST, p);
		HttpResponse<JsonNode> httpResponse = request.asJson();
		JsonNode node = httpResponse.getBody();
		JSONObject gamesJson = node.getObject();
		JSONArray gamesArray = gamesJson.getJSONArray("categories");
		ArrayList<String> games = new ArrayList<>();
		for (int i = 0; i < gamesArray.length(); i++) {
			if (gamesArray.get(i) == null) {
				continue;
			}
			JSONObject catElem = gamesArray.getJSONObject(i);
			if (catElem.isNull("category_name")) {
				continue;
			}
			String catName = catElem.getString("category_name");
			if (catName == null || catName == "") {
				continue;
			}
			games.add(catName);
		}
		return games;
	}
	
}
