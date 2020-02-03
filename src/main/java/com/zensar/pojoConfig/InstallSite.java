package com.zensar.pojoConfig;

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
    "zipcode",
    "country"
})
public class InstallSite {

    @JsonProperty("zipcode")
    private Object zipcode;
    @JsonProperty("country")
    private String country;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("zipcode")
    public Object getZipcode() {
        return zipcode;
    }

    @JsonProperty("zipcode")
    public void setZipcode(Object zipcode) {
        this.zipcode = zipcode;
    }

    public InstallSite withZipcode(Object zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public InstallSite withCountry(String country) {
        this.country = country;
        return this;
    }

    @Override
	public String toString() {
		return "InstallSite [zipcode=" + zipcode + ", country=" + country + ", additionalProperties="
				+ additionalProperties + "]";
	}

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public InstallSite withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(zipcode).append(country).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstallSite) == false) {
            return false;
        }
        InstallSite rhs = ((InstallSite) other);
        return new EqualsBuilder().append(zipcode, rhs.zipcode).append(country, rhs.country).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
