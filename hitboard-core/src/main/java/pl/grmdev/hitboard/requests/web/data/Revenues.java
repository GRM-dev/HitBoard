package pl.grmdev.hitboard.requests.web.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
@JsonPropertyOrder({"summary", "plans", "timeline", "daily", "top"})
public class Revenues {

	@JsonProperty("summary")
	private Summary					summary;
	@JsonProperty("plans")
	private List<Object>				plans						= new ArrayList<Object>();
	@JsonProperty("timeline")
	private List<List<Long>>		timeline					= new ArrayList<List<Long>>();
	@JsonProperty("daily")
	private Map<String, Daily>		daily;
	@JsonProperty("top")
	private Top							top;
	@JsonIgnore
	private Map<String, Object>	additionalProperties	= new HashMap<String, Object>();
														
	/**
	 * @return
	 * 		The summary
	 */
	@JsonProperty("summary")
	public Summary getSummary() {
		return summary;
}

	/**
	 * @param summary
	 *            The summary
	 */
	@JsonProperty("summary")
	public void setSummary(Summary summary) {
		this.summary = summary;
	}
	
	/**
	 * @return
	 * 		The plans
	 */
	@JsonProperty("plans")
	public List<Object> getPlans() {
		return plans;
	}
	
	/**
	 * @param plans
	 *            The plans
	 */
	@JsonProperty("plans")
	public void setPlans(List<Object> plans) {
		this.plans = plans;
	}
	
	/**
	 * @return
	 * 		The timeline
	 */
	@JsonProperty("timeline")
	public List<List<Long>> getTimeline() {
		return timeline;
	}
	
	/**
	 * @param timeline
	 *            The timeline
	 */
	@JsonProperty("timeline")
	public void setTimeline(List<List<Long>> timeline) {
		this.timeline = timeline;
	}
	
	/**
	 * @return
	 * 		The daily
	 */
	@JsonProperty("daily")
	public Map<String, Daily> getDaily() {
		return daily;
	}
	
	/**
	 * @param daily
	 *            The daily
	 */
	@JsonProperty("daily")
	public void setDaily(Map<String, Daily> daily) {
		this.daily = daily;
	}
	
	/**
	 * @return
	 * 		The top
	 */
	@JsonProperty("top")
	public Top getTop() {
		return top;
	}
	
	/**
	 * @param top
	 *            The top
	 */
	@JsonProperty("top")
	public void setTop(Top top) {
		this.top = top;
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
		return new HashCodeBuilder().append(summary).append(plans).append(timeline).append(daily).append(top).append(additionalProperties).toHashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) { return true; }
		if ((other instanceof Revenues) == false) { return false; }
		Revenues rhs = ((Revenues) other);
		return new EqualsBuilder().append(summary, rhs.summary).append(plans, rhs.plans).append(timeline, rhs.timeline).append(daily, rhs.daily).append(top, rhs.top)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}
	
}