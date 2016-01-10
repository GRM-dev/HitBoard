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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"live", "video", "subscriptions"})
public class Content {
	@JsonIgnore
	private Map<String, Object> revContent = new HashMap<String, Object>();
	
	@JsonAnyGetter
	public Map<String, Object> getRevContent() {
		return revContent;
	}

	@JsonAnySetter
	public void setRevContent(Map<String, Object> revContent) {
		this.revContent = revContent;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(getRevContent()).toHashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == this) { return true; }
		if ((other instanceof Content) == false) { return false; }
		Content rhs = ((Content) other);
		return new EqualsBuilder().append(getRevContent(), rhs.getRevContent()).isEquals();
	}
	
}