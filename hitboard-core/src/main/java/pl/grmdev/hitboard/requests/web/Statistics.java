/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.request.GetRequest;

import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.util.HbGet;
import pl.grmdev.hitboard.requests.util.Params;
import pl.grmdev.hitboard.requests.web.data.ChannelStats;
import pl.grmdev.hitboard.requests.web.data.FollowerStats;
import pl.grmdev.hitboard.requests.web.data.RevenueStats;
import pl.grmdev.hitboard.requests.web.data.ViewerStats;

/**
 * @author Levvy055
 */
public class Statistics {
	
	public ChannelStats getChannelStats(String channel, Date startDate, Date endDate) {
		RequestHandler req = RequestHandler.instance();
		HbGet getM = HbGet.STATS_CHANNEL_ALL;
		try {
			Params p = new Params().p("authToken", req.getToken().getToken());
			GetRequest request = req.get(getM, p, channel, String.valueOf(startDate.getTime()), String.valueOf(endDate.getTime()));
			HttpResponse<JsonNode> httpResponse = request.asJson();
			JSONObject object = httpResponse.getBody().getObject();
			if (object.has("channel")) {
				ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
				ChannelStats stats = objectMapper.readValue(object.toString(), ChannelStats.class);
				return stats;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ViewerStats getViewerStats(String channel, Date startDate, Date endDate) {
		RequestHandler req = RequestHandler.instance();
		HbGet getM = HbGet.STATS_VIEWER;
		try {
			Params p = new Params().p("authToken", req.getToken().getToken());
			GetRequest request = req.get(getM, p, channel, String.valueOf(startDate.getTime()), String.valueOf(endDate.getTime()));
			HttpResponse<JsonNode> httpResponse = request.asJson();
			JSONObject object = httpResponse.getBody().getObject();
			if (object.has("channel")) {
				ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
				ViewerStats stats = objectMapper.readValue(object.toString(), ViewerStats.class);
				return stats;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public RevenueStats getRevenueStats(String channel, Date startDate, Date endDate) {
		RequestHandler req = RequestHandler.instance();
		HbGet getM = HbGet.STATS_REVENUE;
		try {
			Params p = new Params().p("authToken", req.getToken().getToken()).p("startDate", String.valueOf(startDate.getTime())).p("endDate", String.valueOf(endDate.getTime()));
			GetRequest request = req.get(getM, p, channel);
			HttpResponse<JsonNode> httpResponse = request.asJson();
			JSONObject object = httpResponse.getBody().getObject();
			if (object.has("revenues")) {
				ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
				RevenueStats stats = objectMapper.readValue(object.toString(), RevenueStats.class);
				return stats;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<FollowerStats> getFollowerStats(String channel) {
		RequestHandler req = RequestHandler.instance();
		HbGet getM = HbGet.STATS_FOLLOWER;
		try {
			Params p = new Params().p("authToken", req.getToken().getToken());
			GetRequest request = req.get(getM, p, channel);
			HttpResponse<JsonNode> httpResponse = request.asJson();
			JSONObject object = httpResponse.getBody().getObject();
			JSONArray jsonArray = object.getJSONArray("followers");
			if (jsonArray == null || jsonArray.length() == 0) { return null; }
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
			List<FollowerStats> list = new ArrayList<>();
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jobj = jsonArray.getJSONObject(i);
				list.add(objectMapper.readValue(jobj.toString(), FollowerStats.class));
			}
			return list;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
