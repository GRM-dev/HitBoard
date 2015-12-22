/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import java.util.*;

import org.json.*;

import com.mashape.unirest.http.*;
import com.mashape.unirest.request.HttpRequest;

import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.util.*;
/**
 * @author Levvy055
 */
public class Games {
	
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
