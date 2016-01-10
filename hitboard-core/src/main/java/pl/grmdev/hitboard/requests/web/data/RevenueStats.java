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
@JsonPropertyOrder({"request", "revenues"})
public class RevenueStats {

	@JsonProperty("request")
	private Request				request;
	@JsonProperty("revenues")
	private Revenues			revenues;
	@JsonIgnore
	private Map<String, Object>	additionalProperties	= new HashMap<String, Object>();
														
	/**
	 * @return
	 * 		The request
	 */
	@JsonProperty("request")
	public Request getRequest() {
		return request;
	}
	
	/**
	 * @param request
	 *            The request
	 */
	@JsonProperty("request")
	public void setRequest(Request request) {
		this.request = request;
	}
	
	/**
	 * @return
	 * 		The revenues
	 */
	@JsonProperty("revenues")
	public Revenues getRevenues() {
		return revenues;
	}
	
	/**
	 * @param revenues
	 *            The revenues
	 */
	@JsonProperty("revenues")
	public void setRevenues(Revenues revenues) {
		this.revenues = revenues;
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
		return new HashCodeBuilder().append(request).append(revenues).append(additionalProperties).toHashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) { return true; }
		if ((other instanceof RevenueStats) == false) { return false; }
		RevenueStats rhs = ((RevenueStats) other);
		return new EqualsBuilder().append(request, rhs.request).append(revenues, rhs.revenues).append(additionalProperties, rhs.additionalProperties).isEquals();
	}
	
}