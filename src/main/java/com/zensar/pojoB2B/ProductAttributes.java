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
    "BundleFlag",
    "Serviceable",
    "DistiOrderableIndicator",
    "AllowedDifferentialDuration"
})
public class ProductAttributes {

    @JsonProperty("BundleFlag")
    private String bundleFlag;
    @JsonProperty("Serviceable")
    private String serviceable;
    @JsonProperty("DistiOrderableIndicator")
    private String distiOrderableIndicator;
    @JsonProperty("AllowedDifferentialDuration")
    private String allowedDifferentialDuration;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("BundleFlag")
    public String getBundleFlag() {
        return bundleFlag;
    }

    @JsonProperty("BundleFlag")
    public void setBundleFlag(String bundleFlag) {
        this.bundleFlag = bundleFlag;
    }

    public ProductAttributes withBundleFlag(String bundleFlag) {
        this.bundleFlag = bundleFlag;
        return this;
    }

    @JsonProperty("Serviceable")
    public String getServiceable() {
        return serviceable;
    }

    @JsonProperty("Serviceable")
    public void setServiceable(String serviceable) {
        this.serviceable = serviceable;
    }

    public ProductAttributes withServiceable(String serviceable) {
        this.serviceable = serviceable;
        return this;
    }

    @JsonProperty("DistiOrderableIndicator")
    public String getDistiOrderableIndicator() {
        return distiOrderableIndicator;
    }

    @JsonProperty("DistiOrderableIndicator")
    public void setDistiOrderableIndicator(String distiOrderableIndicator) {
        this.distiOrderableIndicator = distiOrderableIndicator;
    }

    public ProductAttributes withDistiOrderableIndicator(String distiOrderableIndicator) {
        this.distiOrderableIndicator = distiOrderableIndicator;
        return this;
    }

    @JsonProperty("AllowedDifferentialDuration")
    public String getAllowedDifferentialDuration() {
        return allowedDifferentialDuration;
    }

    @JsonProperty("AllowedDifferentialDuration")
    public void setAllowedDifferentialDuration(String allowedDifferentialDuration) {
        this.allowedDifferentialDuration = allowedDifferentialDuration;
    }

    public ProductAttributes withAllowedDifferentialDuration(String allowedDifferentialDuration) {
        this.allowedDifferentialDuration = allowedDifferentialDuration;
        return this;
    }

    @Override
	public String toString() {
		return "ProductAttributes [bundleFlag=" + bundleFlag + ", serviceable=" + serviceable
				+ ", distiOrderableIndicator=" + distiOrderableIndicator + ", allowedDifferentialDuration="
				+ allowedDifferentialDuration + ", additionalProperties=" + additionalProperties + "]";
	}

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ProductAttributes withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bundleFlag).append(serviceable).append(distiOrderableIndicator).append(allowedDifferentialDuration).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProductAttributes) == false) {
            return false;
        }
        ProductAttributes rhs = ((ProductAttributes) other);
        return new EqualsBuilder().append(bundleFlag, rhs.bundleFlag).append(serviceable, rhs.serviceable).append(distiOrderableIndicator, rhs.distiOrderableIndicator).append(allowedDifferentialDuration, rhs.allowedDifferentialDuration).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
