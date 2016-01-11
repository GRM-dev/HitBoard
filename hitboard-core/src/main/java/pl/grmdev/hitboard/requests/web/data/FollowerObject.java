package pl.grmdev.hitboard.requests.web.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"request", "followers", "max_results"})
public class FollowerObject {

	@JsonProperty("request")
	private Request					request;
	@JsonProperty("followers")
	private List<Follower>			followers				= new ArrayList<Follower>();
	@JsonProperty("max_results")
	private String						maxResults;
	@JsonIgnore
	private Map<String, Object>	additionalProperties	= new HashMap<String, Object>();
																		
	/**
	 * @return
	 * 			The request
	 */
	@JsonProperty("request")
	public Request getRequest() {
		return request;
	}
	
	/**
	 * @param request
	 *           The request
	 */
	@JsonProperty("request")
	public void setRequest(Request request) {
		this.request = request;
	}
	
	/**
	 * @return
	 * 			The followers
	 */
	@JsonProperty("followers")
	public List<Follower> getFollowers() {
		return followers;
}

	/**
	 * @param followers
	 *           The followers
	 */
	@JsonProperty("followers")
	public void setFollowers(List<Follower> followers) {
		this.followers = followers;
	}
	
	/**
	 * @return
	 * 			The maxResults
	 */
	@JsonProperty("max_results")
	public String getMaxResults() {
		return maxResults;
	}
	
	/**
	 * @param maxResults
	 *           The max_results
	 */
	@JsonProperty("max_results")
	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
	
	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(request).append(followers).append(maxResults).append(additionalProperties).toHashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) { return true; }
		if ((other instanceof FollowerObject) == false) { return false; }
		FollowerObject rhs = ((FollowerObject) other);
		return new EqualsBuilder().append(request, rhs.request).append(followers, rhs.followers).append(maxResults, rhs.maxResults).append(additionalProperties, rhs.additionalProperties).isEquals();
	}
	
}