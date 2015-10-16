/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import org.json.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.*;
import com.mashape.unirest.request.GetRequest;

import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.util.*;
/**
 * @author Levvy055
 */
public class Media {
	
	/**
	 * Returns a live media object.
	 */
	public MediaLive getLiveObject() throws Exception {
		RequestHandler req = RequestHandler.instance();
		HbGet getM = HbGet.MEDIA_LIVE_OBJECT;
		String channel = req.getUser().getUserName();
		Params params = new Params().p("authToken", req.getToken().getToken());
		GetRequest getRequest = req.get(getM, params, channel);
		HttpResponse<JsonNode> httpResponse = getRequest.asJson();
		JsonNode jsonNode = httpResponse.getBody();
		JSONObject jsonObject = jsonNode.getObject();
		JSONArray jsonArray = jsonObject.getJSONArray("livestream");
		JSONObject object = jsonArray.getJSONObject(0);
		ObjectMapper objectMapper = new ObjectMapper();
		MediaLive liveMedia = objectMapper.readValue(object.toString(),
				MediaLive.class);
		return liveMedia;
	}
}
