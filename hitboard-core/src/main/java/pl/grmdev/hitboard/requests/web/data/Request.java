package pl.grmdev.hitboard.requests.web.data;

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
@JsonPropertyOrder({"this", "type", "user"})
public class Request {

	@JsonProperty("this")
	private String				_this;
	@JsonProperty("type")
	private String				type;
	@JsonProperty("user")
	private String				user;
	@JsonIgnore
	private Map<String, Object>	additionalProperties	= new HashMap<String, Object>();
														
	/**
	 * @return
	 * 		The _this
	 */
	@JsonProperty("this")
	public String getThis() {
		return _this;
	}
	
	/**
	 * @param _this
	 *            The this
	 */
	@JsonProperty("this")
	public void setThis(String _this) {
		this._this = _this;
	}
	
	/**
	 * @return
	 * 		The type
	 */
	@JsonProperty("type")
	public String getType() {
		return type;
}

	/**
	 * @param type
	 *            The type
	 */
	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * @return
	 * 		The user
	 */
	@JsonProperty("user")
	public String getUser() {
		return user;
	}
	
	/**
	 * @param user
	 *            The user
	 */
	@JsonProperty("user")
	public void setUser(String user) {
		this.user = user;
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
		return new HashCodeBuilder().append(_this).append(type).append(user).append(additionalProperties).toHashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) { return true; }
		if ((other instanceof Request) == false) { return false; }
		Request rhs = ((Request) other);
		return new EqualsBuilder().append(_this, rhs._this).append(type, rhs.type).append(user, rhs.user).append(additionalProperties, rhs.additionalProperties).isEquals();
	}
	
}