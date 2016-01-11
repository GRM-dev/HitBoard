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
@JsonPropertyOrder({"request", "category"})
public class GameObject {
	
	@JsonProperty("request")
	private Request					request;
	@JsonProperty("category")
	private Category					category;
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
	 * 			The category
	 */
	@JsonProperty("category")
	public Category getCategory() {
		return category;
	}
	
	/**
	 * @param category
	 *           The category
	 */
	@JsonProperty("category")
	public void setCategory(Category category) {
		this.category = category;
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
		return new HashCodeBuilder().append(request).append(category).append(additionalProperties).toHashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) { return true; }
		if ((other instanceof GameObject) == false) { return false; }
		GameObject rhs = ((GameObject) other);
		return new EqualsBuilder().append(request, rhs.request).append(category, rhs.category).append(additionalProperties, rhs.additionalProperties).isEquals();
	}
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({"this"})
	public class Request {
		
		@JsonProperty("this")
		private String						_this;
		@JsonIgnore
		private Map<String, Object>	additionalProperties	= new HashMap<String, Object>();
																			
		/**
		 * @return
		 * 			The _this
		 */
		@JsonProperty("this")
		public String getThis() {
			return _this;
		}
		
		/**
		 * @param _this
		 *           The this
		 */
		@JsonProperty("this")
		public void setThis(String _this) {
			this._this = _this;
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
			return new HashCodeBuilder().append(_this).append(additionalProperties).toHashCode();
		}
		
		@Override
		public boolean equals(Object other) {
			if (other == this) { return true; }
			if ((other instanceof Request) == false) { return false; }
			Request rhs = ((Request) other);
			return new EqualsBuilder().append(_this, rhs._this).append(additionalProperties, rhs.additionalProperties).isEquals();
		}
		
	}

}
