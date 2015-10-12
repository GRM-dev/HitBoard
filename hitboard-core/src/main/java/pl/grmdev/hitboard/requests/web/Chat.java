/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import java.util.*;
import java.util.concurrent.*;

import org.json.*;

import com.mashape.unirest.http.*;

import pl.grmdev.hitboard.requests.RequestHandler;
/**
 * Chat related Requests handled by {@link RequestHandler}
 * 
 * @author Levvy055
 */
public class Chat {
	
	/**
	 * Gets list of games available on hitbox.tv
	 * 
	 * @param gamesAsyncTask
	 *            currently started Future task from which this method will take
	 *            game list
	 * @return {@link List}
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
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
