package pl.grmdev.hitboard.requests.web.data;

import java.util.Date;
import java.util.HashMap;
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
@JsonPropertyOrder({
		"channel", "startTime", "endTime", "step", "maxviewer", "maxfollower", "maxregistered", "maxembed", "maxsubscriber", "maxandroid", "maxios", "maxchromecast", "maxweb",
		"totalads", "timeline"})
public class ViewerStats {

	@JsonProperty("channel")
	private String				channel;
	@JsonProperty("startTime")
	private Date				startTime;
	@JsonProperty("endTime")
	private Date				endTime;
	@JsonProperty("step")
	private Integer				step;
	@JsonProperty("maxviewer")
	private Integer				maxviewer;
	@JsonProperty("maxfollower")
	private Integer				maxfollower;
	@JsonProperty("maxregistered")
	private Integer				maxregistered;
	@JsonProperty("maxembed")
	private Integer				maxembed;
	@JsonProperty("maxsubscriber")
	private Integer				maxsubscriber;
	@JsonProperty("maxandroid")
	private Integer				maxandroid;
	@JsonProperty("maxios")
	private Integer				maxios;
	@JsonProperty("maxchromecast")
	private Integer				maxchromecast;
	@JsonProperty("maxweb")
	private Integer				maxweb;
	@JsonProperty("totalads")
	private Integer				totalads;
	@JsonProperty("timeline")
	private Timeline			timeline;
	@JsonIgnore
	private Map<String, Object>	additionalProperties	= new HashMap<String, Object>();
														
	/**
	 * @return
	 * 		The channel
	 */
	@JsonProperty("channel")
	public String getChannel() {
		return channel;
	}
	
	/**
	 * @param channel
	 *            The channel
	 */
	@JsonProperty("channel")
	public void setChannel(String channel) {
		this.channel = channel;
	}
	
	/**
	 * @return
	 * 		The startTime
	 */
	@JsonProperty("startTime")
	public Date getStartTime() {
		return startTime;
	}
	
	/**
	 * @param startTime
	 *            The startTime
	 */
	@JsonProperty("startTime")
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	/**
	 * @return
	 * 		The endTime
	 */
	@JsonProperty("endTime")
	public Date getEndTime() {
		return endTime;
	}
	
	/**
	 * @param endTime
	 *            The endTime
	 */
	@JsonProperty("endTime")
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	/**
	 * @return
	 * 		The step
	 */
	@JsonProperty("step")
	public Integer getStep() {
		return step;
	}
	
	/**
	 * @param step
	 *            The step
	 */
	@JsonProperty("step")
	public void setStep(Integer step) {
		this.step = step;
	}
	
	/**
	 * @return
	 * 		The maxviewer
	 */
	@JsonProperty("maxviewer")
	public Integer getMaxviewer() {
		return maxviewer;
	}
	
	/**
	 * @param maxviewer
	 *            The maxviewer
	 */
	@JsonProperty("maxviewer")
	public void setMaxviewer(Integer maxviewer) {
		this.maxviewer = maxviewer;
	}
	
	/**
	 * @return
	 * 		The maxfollower
	 */
	@JsonProperty("maxfollower")
	public Integer getMaxfollower() {
		return maxfollower;
	}
	
	/**
	 * @param maxfollower
	 *            The maxfollower
	 */
	@JsonProperty("maxfollower")
	public void setMaxfollower(Integer maxfollower) {
		this.maxfollower = maxfollower;
	}
	
	/**
	 * @return
	 * 		The maxregistered
	 */
	@JsonProperty("maxregistered")
	public Integer getMaxregistered() {
		return maxregistered;
	}
	
	/**
	 * @param maxregistered
	 *            The maxregistered
	 */
	@JsonProperty("maxregistered")
	public void setMaxregistered(Integer maxregistered) {
		this.maxregistered = maxregistered;
}

	/**
	 * @return
	 * 		The maxembed
	 */
	@JsonProperty("maxembed")
	public Integer getMaxembed() {
		return maxembed;
	}
	
	/**
	 * @param maxembed
	 *            The maxembed
	 */
	@JsonProperty("maxembed")
	public void setMaxembed(Integer maxembed) {
		this.maxembed = maxembed;
	}
	
	/**
	 * @return
	 * 		The maxsubscriber
	 */
	@JsonProperty("maxsubscriber")
	public Integer getMaxsubscriber() {
		return maxsubscriber;
	}
	
	/**
	 * @param maxsubscriber
	 *            The maxsubscriber
	 */
	@JsonProperty("maxsubscriber")
	public void setMaxsubscriber(Integer maxsubscriber) {
		this.maxsubscriber = maxsubscriber;
	}
	
	/**
	 * @return
	 * 		The maxandroid
	 */
	@JsonProperty("maxandroid")
	public Integer getMaxandroid() {
		return maxandroid;
	}
	
	/**
	 * @param maxandroid
	 *            The maxandroid
	 */
	@JsonProperty("maxandroid")
	public void setMaxandroid(Integer maxandroid) {
		this.maxandroid = maxandroid;
	}
	
	/**
	 * @return
	 * 		The maxios
	 */
	@JsonProperty("maxios")
	public Integer getMaxios() {
		return maxios;
	}
	
	/**
	 * @param maxios
	 *            The maxios
	 */
	@JsonProperty("maxios")
	public void setMaxios(Integer maxios) {
		this.maxios = maxios;
	}
	
	/**
	 * @return
	 * 		The maxchromecast
	 */
	@JsonProperty("maxchromecast")
	public Integer getMaxchromecast() {
		return maxchromecast;
	}
	
	/**
	 * @param maxchromecast
	 *            The maxchromecast
	 */
	@JsonProperty("maxchromecast")
	public void setMaxchromecast(Integer maxchromecast) {
		this.maxchromecast = maxchromecast;
	}
	
	/**
	 * @return
	 * 		The maxweb
	 */
	@JsonProperty("maxweb")
	public Integer getMaxweb() {
		return maxweb;
	}
	
	/**
	 * @param maxweb
	 *            The maxweb
	 */
	@JsonProperty("maxweb")
	public void setMaxweb(Integer maxweb) {
		this.maxweb = maxweb;
	}
	
	/**
	 * @return
	 * 		The totalads
	 */
	@JsonProperty("totalads")
	public Integer getTotalads() {
		return totalads;
	}
	
	/**
	 * @param totalads
	 *            The totalads
	 */
	@JsonProperty("totalads")
	public void setTotalads(Integer totalads) {
		this.totalads = totalads;
	}
	
	/**
	 * @return
	 * 		The timeline
	 */
	@JsonProperty("timeline")
	public Timeline getTimeline() {
		return timeline;
	}
	
	/**
	 * @param timeline
	 *            The timeline
	 */
	@JsonProperty("timeline")
	public void setTimeline(Timeline timeline) {
		this.timeline = timeline;
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
		return new HashCodeBuilder().append(channel).append(startTime).append(endTime).append(step).append(maxviewer).append(maxfollower).append(maxregistered).append(maxembed)
				.append(maxsubscriber).append(maxandroid).append(maxios).append(maxchromecast).append(maxweb).append(totalads).append(additionalProperties)
				.toHashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) { return true; }
		if ((other instanceof ViewerStats) == false) { return false; }
		ViewerStats rhs = ((ViewerStats) other);
		return new EqualsBuilder().append(channel, rhs.channel).append(startTime, rhs.startTime).append(endTime, rhs.endTime).append(step, rhs.step)
				.append(maxviewer, rhs.maxviewer).append(maxfollower, rhs.maxfollower).append(maxregistered, rhs.maxregistered).append(maxembed, rhs.maxembed)
				.append(maxsubscriber, rhs.maxsubscriber).append(maxandroid, rhs.maxandroid).append(maxios, rhs.maxios).append(maxchromecast, rhs.maxchromecast)
				.append(maxweb, rhs.maxweb).append(totalads, rhs.totalads).append(additionalProperties, rhs.additionalProperties).isEquals();
	}
	
}