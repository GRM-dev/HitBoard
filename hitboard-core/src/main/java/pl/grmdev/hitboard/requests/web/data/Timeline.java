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
@JsonPropertyOrder({"viewer", "viewer_avg", "ads", "chromecast", "follower", "subscriber", "web", "android", "registered", "embed", "ios", "views"})
public class Timeline {

	@JsonProperty("viewer")
	private List<List<Long>>	viewer					= new ArrayList<List<Long>>();
	@JsonProperty("viewer_avg")
	private List<List<Long>>	viewerAvg				= new ArrayList<List<Long>>();
	@JsonProperty("ads")
	private List<List<Long>>	ads						= new ArrayList<List<Long>>();
	@JsonProperty("chromecast")
	private List<List<Long>>	chromecast				= new ArrayList<List<Long>>();
	@JsonProperty("follower")
	private List<List<Long>>	follower				= new ArrayList<List<Long>>();
	@JsonProperty("subscriber")
	private List<List<Long>>	subscriber				= new ArrayList<List<Long>>();
	@JsonProperty("web")
	private List<List<Long>>	web						= new ArrayList<List<Long>>();
	@JsonProperty("android")
	private List<List<Long>>	android					= new ArrayList<List<Long>>();
	@JsonProperty("registered")
	private List<List<Long>>	registered				= new ArrayList<List<Long>>();
	@JsonProperty("embed")
	private List<List<Long>>	embed					= new ArrayList<List<Long>>();
	@JsonProperty("ios")
	private List<List<Long>>	ios						= new ArrayList<List<Long>>();
	@JsonProperty("views")
	private List<List<Long>>	views					= new ArrayList<List<Long>>();
	@JsonIgnore
	private Map<String, Object>	additionalProperties	= new HashMap<String, Object>();
														
	/**
	 * @return
	 * 		The viewer
	 */
	@JsonProperty("viewer")
	public List<List<Long>> getViewer() {
		return viewer;
	}
	
	/**
	 * @param viewer
	 *            The viewer
	 */
	@JsonProperty("viewer")
	public void setViewer(List<List<Long>> viewer) {
		this.viewer = viewer;
	}
	
	/**
	 * @return
	 * 		The viewerAvg
	 */
	@JsonProperty("viewer_avg")
	public List<List<Long>> getViewerAvg() {
		return viewerAvg;
	}
	
	/**
	 * @param viewerAvg
	 *            The viewer_avg
	 */
	@JsonProperty("viewer_avg")
	public void setViewerAvg(List<List<Long>> viewerAvg) {
		this.viewerAvg = viewerAvg;
	}
	
	/**
	 * @return
	 * 		The ads
	 */
	@JsonProperty("ads")
	public List<List<Long>> getAds() {
		return ads;
	}
	
	/**
	 * @param ads
	 *            The ads
	 */
	@JsonProperty("ads")
	public void setAds(List<List<Long>> ads) {
		this.ads = ads;
	}
	
	/**
	 * @return
	 * 		The chromecast
	 */
	@JsonProperty("chromecast")
	public List<List<Long>> getChromecast() {
		return chromecast;
	}
	
	/**
	 * @param chromecast
	 *            The chromecast
	 */
	@JsonProperty("chromecast")
	public void setChromecast(List<List<Long>> chromecast) {
		this.chromecast = chromecast;
	}
	
	/**
	 * @return
	 * 		The follower
	 */
	@JsonProperty("follower")
	public List<List<Long>> getFollower() {
		return follower;
	}
	
	/**
	 * @param follower
	 *            The follower
	 */
	@JsonProperty("follower")
	public void setFollower(List<List<Long>> follower) {
		this.follower = follower;
	}
	
	/**
	 * @return
	 * 		The subscriber
	 */
	@JsonProperty("subscriber")
	public List<List<Long>> getSubscriber() {
		return subscriber;
	}
	
	/**
	 * @param subscriber
	 *            The subscriber
	 */
	@JsonProperty("subscriber")
	public void setSubscriber(List<List<Long>> subscriber) {
		this.subscriber = subscriber;
	}
	
	/**
	 * @return
	 * 		The web
	 */
	@JsonProperty("web")
	public List<List<Long>> getWeb() {
		return web;
	}
	
	/**
	 * @param web
	 *            The web
	 */
	@JsonProperty("web")
	public void setWeb(List<List<Long>> web) {
		this.web = web;
	}
	
	/**
	 * @return
	 * 		The android
	 */
	@JsonProperty("android")
	public List<List<Long>> getAndroid() {
		return android;
	}
	
	/**
	 * @param android
	 *            The android
	 */
	@JsonProperty("android")
	public void setAndroid(List<List<Long>> android) {
		this.android = android;
	}
	
	/**
	 * @return
	 * 		The registered
	 */
	@JsonProperty("registered")
	public List<List<Long>> getRegistered() {
		return registered;
	}
	
	/**
	 * @param registered
	 *            The registered
	 */
	@JsonProperty("registered")
	public void setRegistered(List<List<Long>> registered) {
		this.registered = registered;
	}
	
	/**
	 * @return
	 * 		The embed
	 */
	@JsonProperty("embed")
	public List<List<Long>> getEmbed() {
		return embed;
	}
	
	/**
	 * @param embed
	 *            The embed
	 */
	@JsonProperty("embed")
	public void setEmbed(List<List<Long>> embed) {
		this.embed = embed;
	}
	
	/**
	 * @return
	 * 		The ios
	 */
	@JsonProperty("ios")
	public List<List<Long>> getIos() {
		return ios;
	}
	
	/**
	 * @param ios
	 *            The ios
	 */
	@JsonProperty("ios")
	public void setIos(List<List<Long>> ios) {
		this.ios = ios;
	}
	
	/**
	 * @return
	 * 		The views
	 */
	@JsonProperty("views")
	public List<List<Long>> getViews() {
		return views;
	}
	
	/**
	 * @param views
	 *            The views
	 */
	@JsonProperty("views")
	public void setViews(List<List<Long>> views) {
		this.views = views;
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
		return new HashCodeBuilder().append(viewer).append(viewerAvg).append(ads).append(chromecast).append(follower).append(subscriber).append(web).append(android)
				.append(registered).append(embed).append(ios).append(views).append(additionalProperties).toHashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) { return true; }
		if ((other instanceof Timeline) == false) { return false; }
		Timeline rhs = ((Timeline) other);
		return new EqualsBuilder().append(viewer, rhs.viewer).append(viewerAvg, rhs.viewerAvg).append(ads, rhs.ads).append(chromecast, rhs.chromecast)
				.append(follower, rhs.follower).append(subscriber, rhs.subscriber).append(web, rhs.web).append(android, rhs.android).append(registered, rhs.registered)
				.append(embed, rhs.embed).append(ios, rhs.ios).append(views, rhs.views).append(additionalProperties, rhs.additionalProperties).isEquals();
	}
	
}
