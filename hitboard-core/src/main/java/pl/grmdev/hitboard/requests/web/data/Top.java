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
@JsonPropertyOrder({"countries", "content"})
public class Top {

	@JsonProperty("countries")
	private List<Object>				countries				= new ArrayList<Object>();
	@JsonProperty("content")
	private Map<String, RevContent>	content					= new HashMap<String, RevContent>();
	@JsonIgnore
	private Map<String, Object>	additionalProperties	= new HashMap<String, Object>();
																		
	/**
	 * @return
	 * 			The countries
	 */
	@JsonProperty("countries")
	public List<Object> getCountries() {
		return countries;
	}
	
	/**
	 * @param countries
	 *           The countries
	 */
	@JsonProperty("countries")
	public void setCountries(List<Object> countries) {
		this.countries = countries;
	}
	
	/**
	 * @return
	 * 			The content
	 */
	@JsonProperty("content")
	public Map<String, RevContent> getContent() {
		return content;
	}
	
	/**
	 * @param content
	 *           The content
	 */
	@JsonProperty("content")
	public void setContent(Map<String, RevContent> content) {
		this.content = content;
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
		return new HashCodeBuilder().append(countries).append(content).append(additionalProperties).toHashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) { return true; }
		if ((other instanceof Top) == false) { return false; }
		Top rhs = ((Top) other);
		return new EqualsBuilder().append(countries, rhs.countries).append(content, rhs.content).append(additionalProperties, rhs.additionalProperties).isEquals();
	}
	
}