package com.zensar.pojoConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "attribute"
})
public class ExtendedAttributes {

    @JsonProperty("attribute")
    private List<Attribute> attribute = new ArrayList<Attribute>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("attribute")
    public List<Attribute> getAttribute() {
        return attribute;
    }

    @JsonProperty("attribute")
    public void setAttribute(List<Attribute> attribute) {
        this.attribute = attribute;
    }

    public ExtendedAttributes withAttribute(List<Attribute> attribute) {
        this.attribute = attribute;
        return this;
    }

    @Override
	public String toString() {
		return "ExtendedAttributes [attribute=" + attribute + ", additionalProperties=" + additionalProperties + "]";
	}

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ExtendedAttributes withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(attribute).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExtendedAttributes) == false) {
            return false;
        }
        ExtendedAttributes rhs = ((ExtendedAttributes) other);
        return new EqualsBuilder().append(attribute, rhs.attribute).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
