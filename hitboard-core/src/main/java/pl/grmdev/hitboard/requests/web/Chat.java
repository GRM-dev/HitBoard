/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import java.util.*;
import java.util.concurrent.*;

import org.json.*;

import com.mashape.unirest.http.*;

/**
 * @author Levvy055
 *
 */
public class Chat {
	public List<String> getGamesList(
			Future<HttpResponse<JsonNode>> gamesAsyncTask)
					throws InterruptedException, ExecutionException {
		ArrayList<String> games = new ArrayList<>();
		HttpResponse<JsonNode> httpResponse = gamesAsyncTask.get();
		JSONObject gamesJson = httpResponse.getBody().getObject();
		JSONArray gamesArray = gamesJson.getJSONArray("categories");
		for (int i = 0; i < gamesArray.length(); i++) {
			if (gamesArray.get(i) == null) {
				continue;
			}
			JSONObject catElem = gamesArray.getJSONObject(i);
			if (catElem.isNull("category_name")) {
				continue;
			}
			String catName = catElem.getString("category_name");
			System.out.println(i + ": " + catName);
			if (catName == null || catName == "") {
				continue;
			}
			games.add(catName);
		}
		return games;
	}
}
