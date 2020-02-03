
package com.zensar.pojoB2B;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Duration"
})
public class LeadTime {

    @JsonProperty("Duration")
    private String duration;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("Duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public LeadTime withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    @Override
	public String toString() {
		return "LeadTime [duration=" + duration + ", additionalProperties=" + additionalProperties + "]";
	}

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public LeadTime withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(duration).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LeadTime) == false) {
            return false;
        }
        LeadTime rhs = ((LeadTime) other);
        return new EqualsBuilder().append(duration, rhs.duration).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
