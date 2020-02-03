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
    "UnitListPrice",
    "CurrencyCode",
    "PerQuantity",
    "ExtendedListPrice"
})
public class PricingInformation {

    @JsonProperty("UnitListPrice")
    private String unitListPrice;
    @JsonProperty("CurrencyCode")
    private String currencyCode;
    @JsonProperty("PerQuantity")
    private String perQuantity;
    @JsonProperty("ExtendedListPrice")
    private String extendedListPrice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("UnitListPrice")
    public String getUnitListPrice() {
        return unitListPrice;
    }

    @JsonProperty("UnitListPrice")
    public void setUnitListPrice(String unitListPrice) {
        this.unitListPrice = unitListPrice;
    }

    public PricingInformation withUnitListPrice(String unitListPrice) {
        this.unitListPrice = unitListPrice;
        return this;
    }

    @JsonProperty("CurrencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("CurrencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public PricingInformation withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    @JsonProperty("PerQuantity")
    public String getPerQuantity() {
        return perQuantity;
    }

    @JsonProperty("PerQuantity")
    public void setPerQuantity(String perQuantity) {
        this.perQuantity = perQuantity;
    }

    public PricingInformation withPerQuantity(String perQuantity) {
        this.perQuantity = perQuantity;
        return this;
    }

    @JsonProperty("ExtendedListPrice")
    public String getExtendedListPrice() {
        return extendedListPrice;
    }

    @JsonProperty("ExtendedListPrice")
    public void setExtendedListPrice(String extendedListPrice) {
        this.extendedListPrice = extendedListPrice;
    }

    public PricingInformation withExtendedListPrice(String extendedListPrice) {
        this.extendedListPrice = extendedListPrice;
        return this;
    }

    @Override
	public String toString() {
		return "PricingInformation [unitListPrice=" + unitListPrice + ", currencyCode=" + currencyCode
				+ ", perQuantity=" + perQuantity + ", extendedListPrice=" + extendedListPrice
				+ ", additionalProperties=" + additionalProperties + "]";
	}

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public PricingInformation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(unitListPrice).append(currencyCode).append(perQuantity).append(extendedListPrice).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PricingInformation) == false) {
            return false;
        }
        PricingInformation rhs = ((PricingInformation) other);
        return new EqualsBuilder().append(unitListPrice, rhs.unitListPrice).append(currencyCode, rhs.currencyCode).append(perQuantity, rhs.perQuantity).append(extendedListPrice, rhs.extendedListPrice).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
