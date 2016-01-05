package pl.grmdev.hitboard.requests.web.data;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"channel", "startTime", "endTime", "totalUniques", "totalViewtime", "totalViews", "totalCountries",
		"countries"})
public class ChannelStats {
	@JsonProperty("channel")
	private String channel;
	@JsonProperty("startTime")
	private Integer startTime;
	@JsonProperty("endTime")
	private Integer endTime;
	@JsonProperty("totalUniques")
	private Integer totalUniques;
	@JsonProperty("totalViewtime")
	private Integer totalViewtime;
	@JsonProperty("totalViews")
	private Integer totalViews;
	@JsonProperty("totalCountries")
	private Integer totalCountries;
	@JsonProperty("countries")
	private Countries countries;
	
	/**
	 * 
	 * @return The channel
	 */
	@JsonProperty("channel")
	public String getChannel() {
		return channel;
	}
	
	/**
	 * 
	 * @param channel
	 *            The channel
	 */
	@JsonProperty("channel")
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * 
	 * @return The startTime
	 */
	@JsonProperty("startTime")
	public Integer getStartTime() {
		return startTime;
	}
	
	/**
	 * 
	 * @param startTime
	 *            The startTime
	 */
	@JsonProperty("startTime")
	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}
	
	/**
	 * 
	 * @return The endTime
	 */
	@JsonProperty("endTime")
	public Integer getEndTime() {
		return endTime;
	}
	
	/**
	 * 
	 * @param endTime
	 *            The endTime
	 */
	@JsonProperty("endTime")
	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}
	
	/**
	 * 
	 * @return The totalUniques
	 */
	@JsonProperty("totalUniques")
	public Integer getTotalUniques() {
		return totalUniques;
	}
	
	/**
	 * 
	 * @param totalUniques
	 *            The totalUniques
	 */
	@JsonProperty("totalUniques")
	public void setTotalUniques(Integer totalUniques) {
		this.totalUniques = totalUniques;
	}
	
	/**
	 * 
	 * @return The totalViewtime
	 */
	@JsonProperty("totalViewtime")
	public Integer getTotalViewtime() {
		return totalViewtime;
	}
	
	/**
	 * 
	 * @param totalViewtime
	 *            The totalViewtime
	 */
	@JsonProperty("totalViewtime")
	public void setTotalViewtime(Integer totalViewtime) {
		this.totalViewtime = totalViewtime;
	}
	
	/**
	 * 
	 * @return The totalViews
	 */
	@JsonProperty("totalViews")
	public Integer getTotalViews() {
		return totalViews;
	}
	
	/**
	 * 
	 * @param totalViews
	 *            The totalViews
	 */
	@JsonProperty("totalViews")
	public void setTotalViews(Integer totalViews) {
		this.totalViews = totalViews;
	}
	
	/**
	 * 
	 * @return The totalCountries
	 */
	@JsonProperty("totalCountries")
	public Integer getTotalCountries() {
		return totalCountries;
	}
	
	/**
	 * 
	 * @param totalCountries
	 *            The totalCountries
	 */
	@JsonProperty("totalCountries")
	public void setTotalCountries(Integer totalCountries) {
		this.totalCountries = totalCountries;
	}
	
	/**
	 * 
	 * @return The countries
	 */
	@JsonProperty("countries")
	public Countries getCountries() {
		return countries;
	}
	
	/**
	 * 
	 * @param countries
	 *            The countries
	 */
	@JsonProperty("countries")
	public void setCountries(Countries countries) {
		this.countries = countries;
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
		return new HashCodeBuilder().append(channel).append(startTime).append(endTime).append(totalUniques)
				.append(totalViewtime).append(totalViews).append(totalCountries).append(countries)
				.append(additionalProperties).toHashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ChannelStats) == false) {
			return false;
		}
		ChannelStats rhs = (ChannelStats) other;
		return new EqualsBuilder().append(channel, rhs.channel).append(startTime, rhs.startTime)
				.append(endTime, rhs.endTime).append(totalUniques, rhs.totalUniques)
				.append(totalViewtime, rhs.totalViewtime).append(totalViews, rhs.totalViews)
				.append(totalCountries, rhs.totalCountries).append(countries, rhs.countries)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}
}
