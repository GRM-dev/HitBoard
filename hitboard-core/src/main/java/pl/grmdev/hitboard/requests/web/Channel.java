/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import java.util.*;

import org.json.*;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.request.GetRequest;

import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.util.*;
import pl.grmdev.hitboard.requests.web.data.*;

/**
 * @author Levvy055
 */
public class Channel {
	
	/**
	 * @param user
	 * @return
	 */
	public Editor getEditor(String user) {
		RequestHandler req = RequestHandler.instance();
		HbGet getM = HbGet.CHANNEL_EDITOR_OBJECT;
		try {
			Params p = new Params().p("authToken", req.getToken().getToken());
			GetRequest request = req.get(getM, p, user);
			HttpResponse<JsonNode> httpResponse = request.asJson();
			JSONObject object = httpResponse.getBody().getObject();
			if (object.has("list")) {
			JSONArray array = object
					.getJSONArray("list");
				if (array.length() == 0) {
					return null;
				}
				JSONObject obj = array.getJSONObject(0);
				ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.configure(
						DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT,
						true);
				Editor editor = objectMapper.readValue(obj.toString(),
						ChannelData.class);
				return editor;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * @param channel
	 * @return
	 */
	public List<Editor> getEditors(String channel) {
		RequestHandler req = RequestHandler.instance();
		HbGet getM = HbGet.CHANNEL_EDITORS;
		try {
			Params p = new Params().p("authToken", req.getToken().getToken());
			GetRequest request = req.get(getM, p, channel);
			HttpResponse<JsonNode> httpResponse = request.asJson();
			JSONObject object = httpResponse.getBody().getObject();
			if (object.has("list")) {
				JSONArray array = object.getJSONArray("list");
				if (array.length() == 0) {
					return null;
				}
				ObjectMapper objectMapper = new ObjectMapper();
				List<Editor> editors = new ArrayList<>();
				for (int i = 0; i < array.length(); i++) {
					JSONObject obj = array.getJSONObject(i);
				objectMapper.configure(
						DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT,
						true);
				Editor editor = objectMapper.readValue(obj.toString(),
							ChannelData.class);
					editors.add(editor);
				}
				return editors;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * @param channel
	 * @return
	 */
	public List<Hoster> getHosters(String channel) {
		RequestHandler req = RequestHandler.instance();
		HbGet getM = HbGet.CHANNEL_HOSTERS;
		try {
			Params p = new Params().p("authToken", req.getToken().getToken());
			GetRequest request = req.get(getM, p, channel);
			HttpResponse<JsonNode> httpResponse = request.asJson();
			JSONObject object = httpResponse.getBody().getObject();
			if (object.has("hosters")) {
				JSONArray array = object.getJSONArray("hosters");
				ObjectMapper objectMapper = new ObjectMapper();
				List<Hoster> hosters = new ArrayList<>();
				for (int i = 0; i < array.length(); i++) {
					JSONObject obj = array.getJSONObject(i);
					objectMapper.configure(
							DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT,
							true);
					Hoster hoster = objectMapper.readValue(obj.toString(),
							ChannelData.class);
					hosters.add(hoster);
				}
				return hosters;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
