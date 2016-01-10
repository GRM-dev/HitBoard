package pl.grmdev.hitboard.requests.web.data;

import java.util.HashMap;
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
@JsonPropertyOrder({"earnings"})
public class RevContent {

	@JsonProperty("earnings")
	private Long				earnings;
	@JsonIgnore
	private Map<String, Object>	additionalProperties	= new HashMap<String, Object>();
														
	/**
	 * @return
	 * 		The earnings
	 */
	@JsonProperty("earnings")
	public Long getEarnings() {
		return earnings;
}

	/**
	 * @param earnings
	 *            The earnings
	 */
	@JsonProperty("earnings")
	public void setEarnings(Long earnings) {
		this.earnings = earnings;
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
		return new HashCodeBuilder().append(earnings).append(additionalProperties).toHashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) { return true; }
		if ((other instanceof RevContent) == false) { return false; }
		RevContent rhs = ((RevContent) other);
		return new EqualsBuilder().append(earnings, rhs.earnings).append(additionalProperties, rhs.additionalProperties).isEquals();
	}
	
}