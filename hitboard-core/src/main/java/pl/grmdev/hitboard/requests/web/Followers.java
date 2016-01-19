/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import java.util.List;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.request.GetRequest;

import pl.grmdev.hitboard.requests.RequestHandler;
import pl.grmdev.hitboard.requests.util.HbGet;
import pl.grmdev.hitboard.requests.util.Params;
import pl.grmdev.hitboard.requests.web.data.Follower;
import pl.grmdev.hitboard.requests.web.data.FollowerObject;
import pl.grmdev.hitboard.requests.web.data.FollowingStatus;
import pl.grmdev.hitboard.requests.web.data.SortType;

/**
 * @author Levvy055
 */
public class Followers {

	public List<Follower> getFollowers(String channel, int offset, int limit, boolean reverse, SortType sort) throws Exception {
		Params p = new Params().p("offset", offset).p("limit", limit).p("reverse", reverse).p("sort", sort.toString().toLowerCase());
		GetRequest request = RequestHandler.instance().get(HbGet.FOLLOWERS_GET_ALL, p, channel);
		HttpResponse<JsonNode> response = request.asJson();
		JSONObject object = response.getBody().getObject();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
		FollowerObject followerObject = objectMapper.readValue(object.toString(), FollowerObject.class);
		List<Follower> followers = followerObject.getFollowers();
		return followers;
	}
	
	public List<Follower> getFollowedChannels(String channel, int offset, int limit, boolean reverse, SortType sort) throws Exception {
		Params p = new Params().p("user_name", channel).p("offset", offset).p("limit", limit).p("reverse", reverse).p("sort", sort.toString().toLowerCase());
		GetRequest request = RequestHandler.instance().get(HbGet.FOLLOWERS_FOLLOWING, p);
		HttpResponse<JsonNode> response = request.asJson();
		JSONObject object = response.getBody().getObject();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
		FollowerObject followerObject = objectMapper.readValue(object.toString(), FollowerObject.class);
		List<Follower> followers = followerObject.getFollowers();
		return followers;
	}
	
	public FollowingStatus getFollowingStatus(String channel, String username) throws Exception {
		Params p = new Params().p("user_name", username);
		GetRequest request = RequestHandler.instance().get(HbGet.FOLLOWERS_RELATIONSHIP, p, channel);
		HttpResponse<JsonNode> response = request.asJson();
		JSONObject object = response.getBody().getObject();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
		FollowingStatus followerStatus = objectMapper.readValue(object.toString(), Follower.class);
		return followerStatus;
	}
	

}
