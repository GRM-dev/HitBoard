/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import java.io.IOException;
import java.util.*;

import org.json.*;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.request.*;

import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.util.*;
import pl.grmdev.hitboard.requests.web.data.*;
/**
 * @author Levvy055
 */
public class Media {
	
	/**
	 * Returns a live media object.
	 */
	public MediaObject getLiveObject(String channel) throws Exception {
		RequestHandler req = RequestHandler.instance();
		HbGet getM = HbGet.MEDIA_LIVE_OBJECT;
		Params params = new Params().p("authToken", req.getToken().getToken());
		GetRequest getRequest = req.get(getM, params, channel);
		HttpResponse<JsonNode> httpResponse = getRequest.asJson();
		JsonNode jsonNode = httpResponse.getBody();
		JSONObject jsonObject = jsonNode.getObject();
		JSONArray jsonArray = jsonObject.getJSONArray("livestream");
		MediaObject liveMedia = getAsMediaLive(jsonArray).get(0);
		return liveMedia;
	}
	
	public List<MediaObject> getLiveObjectsList(boolean publicOnly,
			boolean showHidden, boolean hiddenOnly, boolean liveOnly) {
		RequestHandler req = RequestHandler.instance();
		HbGet method = HbGet.MEDIA_LIVE_LIST;
		Params params = new Params().p("authToken", req.getToken().getToken())
				.p("publicOnly", publicOnly).p("showHidden", showHidden)
				.p("hiddenOnly", hiddenOnly).p("liveOnly", liveOnly);
		try {
			GetRequest getRequest = req.get(method, params);
			HttpResponse<JsonNode> httpResponse = getRequest.asJson();
			JsonNode jsonNode = httpResponse.getBody();
			JSONObject jsonObject = jsonNode.getObject();
			JSONArray jsonArray = jsonObject.getJSONArray("livestream");
			return getAsMediaLive(jsonArray);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public MediaStatus getMediaStatus(String channel) throws Exception {
		RequestHandler req = RequestHandler.instance();
		HbGet getM = HbGet.MEDIA_STATUS;
		GetRequest getRequest = req.get(getM, channel);
		HttpResponse<JsonNode> httpResponse = getRequest.asJson();
		JsonNode jsonNode = httpResponse.getBody();
		JSONObject jsonObject = jsonNode.getObject();
		String isLiveS = null;
		String viewsS = null;
		try {
			isLiveS = jsonObject.getString("media_is_live");
			viewsS = jsonObject.getString("media_views");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		boolean isLive = Boolean.parseBoolean(isLiveS);
		int views = Integer.parseInt(viewsS);
		MediaStatus mediaStatus = new MediaStatus(isLive, views);
		return mediaStatus;
	}
	
	/**
	 * @param showHidden
	 * @throws Exception
	 */
	public List<MediaObject> getMediaVideoObjectList(boolean publicOnly,
			boolean showHidden, boolean hiddenOnly, boolean liveOnly,
			boolean yt, int limit, String channel) throws Exception {
		RequestHandler req = RequestHandler.instance();
		HbGet method = HbGet.MEDIA_VIDEO_LIST;
		Params params = new Params().p("authToken", req.getToken().getToken())
				.p("publicOnly", publicOnly).p("showHidden", showHidden)
				.p("hiddenOnly", hiddenOnly).p("liveOnly", liveOnly).p("yt", yt)
				.p("limit", limit);
		GetRequest getRequest = req.get(method, params, channel);
		HttpResponse<JsonNode> httpResponse = getRequest.asJson();
		JsonNode jsonNode = httpResponse.getBody();
		JSONObject jsonObject = jsonNode.getObject();
		JSONArray jsonArray = jsonObject.getJSONArray("video");
		return getAsMediaLive(jsonArray);
	}
	
	/**
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	public MediaObject getVideoObject(String media_id) throws Exception {
		RequestHandler req = RequestHandler.instance();
		HbGet getM = HbGet.MEDIA_VIDEO_OBJECT;
		Params params = new Params().p("authToken", req.getToken().getToken());
		GetRequest getRequest = req.get(getM, params, media_id);
		HttpResponse<JsonNode> httpResponse = getRequest.asJson();
		JsonNode jsonNode = httpResponse.getBody();
		JSONObject jsonObject = jsonNode.getObject();
		JSONArray jsonArray = jsonObject.getJSONArray("video");
		MediaObject liveMedia = getAsMediaLive(jsonArray).get(0);
		return liveMedia;
	}
	
	/**
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	public int getMediaVievs(String channel) throws Exception {
		RequestHandler req = RequestHandler.instance();
		HbGet getM = HbGet.MEDIA_VIEWS;
		GetRequest getRequest = req.get(getM, channel);
		HttpResponse<JsonNode> httpResponse = getRequest.asJson();
		JsonNode jsonNode = httpResponse.getBody();
		JSONObject jsonObject = jsonNode.getObject();
		String viewsS = jsonObject.getString("total_live_views");
		int views = 0;
		if (!viewsS.equals("false")) {
			views = Integer.parseInt(viewsS);
		}
		return views;
	}
	
	/**
	 * @param string
	 * @throws Exception
	 */
	public MediaInfo getStreamInfo(String channel) throws Exception {
		RequestHandler req = RequestHandler.instance();
		HbGet getM = HbGet.MEDIA_LIVE_OBJECT;
		GetRequest getRequest = req.get(getM, channel);
		HttpResponse<JsonNode> httpResponse = getRequest.asJson();
		JsonNode jsonNode = httpResponse.getBody();
		JSONObject jsonObject = jsonNode.getObject();
		MediaInfo mediaInfo = (MediaInfo) jsonObject.get("mediainfo");
		return mediaInfo;
	}
	
	private List<MediaObject> getAsMediaLive(JSONArray jsonArray)
			throws JSONException, IOException, JsonParseException,
			JsonMappingException {
		List<MediaObject> liveList = new ArrayList<MediaObject>();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(
				DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT,
				true);
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject arrObj = jsonArray.getJSONObject(i);
			int mediaId = arrObj.getInt("media_id");
			if (mediaId > 0) {
				MediaObject liveMedia = objectMapper
						.readValue(arrObj.toString(), MediaObject.class);
				liveList.add(liveMedia);
			}
		}
		return liveList;
	}
	
	/**
	 * @param i
	 * @param userName
	 * @throws Exception
	 */
	public List<Recording> getRecordingObjects(int limit, String channel)
			throws Exception {
		RequestHandler req = RequestHandler.instance();
		HbGet method = HbGet.MEDIA_RECORDING_OBJECT;
		Params params = new Params().p("authToken", req.getToken().getToken())
				.p("limit", limit);
		GetRequest getRequest = req.get(method, params, channel);
		HttpResponse<JsonNode> httpResponse = getRequest.asJson();
		JsonNode jsonNode = httpResponse.getBody();
		JSONArray jsonArray = jsonNode.getArray();
		List<Recording> list = new ArrayList<>();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(
				DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT,
				true);
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject recJson = jsonArray.getJSONObject(i);
			Recording recording = objectMapper.readValue(recJson.toString(),
					Recording.class);
			list.add(recording);
		}
		return list;
	}
	
	public int createVODFromRecording(String channel, String videoTitle,
			String videoStatus, int hidden, MediaCategory cat, double duration,
			double startTime, String recSession, boolean original) {
		HbPost method = HbPost.MEDIA_CREATE_VOD;
		RequestHandler req = RequestHandler.instance();
		Params catIdParams = cat.getParams();
		Params params = new Params().p("user_name", channel)
				.p("authToken", req.getToken().getToken())
				.p("media_type", "video").p("media_title", videoTitle)
				.p("media_status", videoStatus).p("media_name", channel)
				.p("media_hidden", hidden).p("media_category_id", catIdParams)
				.p("clip_duration", duration).p("clip_start", startTime)
				.p("rec_session", recSession).p("original", original);
		try {
			BaseRequest postReq = req.post(method, params, channel);
			HttpResponse<JsonNode> httpResponse = postReq.asJson();
			JsonNode jsonNode = httpResponse.getBody();
			JSONObject jsonObject = jsonNode.getObject();
			if (jsonObject.has("media_id")) {
				return jsonObject.getInt("media_id");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	/**
	 * @param channel
	 * @return {@link MediaObject}
	 */
	public MediaObject updateLiveChannel(String channel,
			MediaObject liveChannel) {
		HbPut method = HbPut.MEDIA_LIVE_UPDATE;
		RequestHandler req = RequestHandler.instance();
		try {
			Map<String, Object> liveStreamObject = liveChannel
					.toUpdateLiveFormat();
			JSONObject arr = new JSONObject();
			for (Iterator<String> it = liveStreamObject.keySet().iterator(); it
					.hasNext();) {
				String key = it.next();
				Object value = liveStreamObject.get(key);
				arr.put(key, value);
			}
			Map[] map = new Map[1];
			map[0] = liveStreamObject;
			JSONObject body = new JSONObject();
			body.put("livestream", map);
			JsonNode node = new JsonNode(body.toString());
			Params p = new Params().p("authToken", req.getToken().getToken());
			BaseRequest putReq = req.put(method, node, p, channel);
			HttpResponse<JsonNode> httpResponse = putReq.asJson();
			JsonNode jsonNode = httpResponse.getBody();
			JSONArray jsonArray = jsonNode.getObject()
					.getJSONArray("livestream");
			MediaObject mediaObjectUpdated = getAsMediaLive(jsonArray).get(0);
			return mediaObjectUpdated;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * @return
	 */
	public MediaObject updateVideo(String videoID, MediaObject video) {
		HbPut method = HbPut.MEDIA_VIDEO_UPDATE;
		RequestHandler req = RequestHandler.instance();
		try {
			Map<String, Object> liveStreamObject = video.toUpdateVideoFormat();
			JSONObject arr = new JSONObject();
			for (Iterator<String> it = liveStreamObject.keySet().iterator(); it
					.hasNext();) {
				String key = it.next();
				Object value = liveStreamObject.get(key);
				arr.put(key, value);
			}
			Map[] map = new Map[1];
			map[0] = liveStreamObject;
			JSONObject body = new JSONObject();
			body.put("video", map);
			JsonNode node = new JsonNode(body.toString());
			Params p = new Params().p("authToken", req.getToken().getToken());
			BaseRequest putReq = req.put(method, node, p, videoID);
			HttpResponse<JsonNode> httpResponse = putReq.asJson();
			JsonNode jsonNode = httpResponse.getBody();
			JSONArray jsonArray = jsonNode.getObject().getJSONArray("video");
			MediaObject mediaObjectUpdated = getAsMediaLive(jsonArray).get(0);
			return mediaObjectUpdated;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
