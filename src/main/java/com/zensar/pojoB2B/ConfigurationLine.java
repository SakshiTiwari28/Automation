
package com.zensar.pojoB2B;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "LineNumber",
    "ParentID",
    "Description",
    "Quantity",
    "ItemName",
    "PricingInformation",
    "ItemType",
    "InstallSiteLocation",
    "LeadTime",
    "ProductAttributes",
    "ConfigurationRecommendationAttributes"
})

@JsonIgnoreProperties
public class ConfigurationLine {

    @JsonProperty("LineNumber")
    private String lineNumber;
    @JsonProperty("ParentID")
    private String parentID;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Quantity")
    private String quantity;
    @JsonProperty("ItemName")
    private String itemName;
    @JsonProperty("PricingInformation")
    private PricingInformation pricingInformation;
    @JsonProperty("ItemType")
    private String itemType;
    @JsonProperty("InstallSiteLocation")
    private InstallSiteLocation installSiteLocation;
    @JsonProperty("LeadTime")
    private LeadTime leadTime;
    @JsonProperty("ProductAttributes")
    private ProductAttributes productAttributes;
    @JsonProperty("ConfigurationRecommendationAttributes")
    private ConfigurationRecommendationAttributes configurationRecommendationAttributes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("LineNumber")
    public String getLineNumber() {
        return lineNumber;
    }

    @JsonProperty("LineNumber")
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public ConfigurationLine withLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    @JsonProperty("ParentID")
    public String getParentID() {
        return parentID;
    }

    @JsonProperty("ParentID")
    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    public ConfigurationLine withParentID(String parentID) {
        this.parentID = parentID;
        return this;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ConfigurationLine withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("Quantity")
    public String getQuantity() {
        return quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public ConfigurationLine withQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonProperty("ItemName")
    public String getItemName() {
        return itemName;
    }

    @JsonProperty("ItemName")
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ConfigurationLine withItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    @JsonProperty("PricingInformation")
    public PricingInformation getPricingInformation() {
        return pricingInformation;
    }

    @JsonProperty("PricingInformation")
    public void setPricingInformation(PricingInformation pricingInformation) {
        this.pricingInformation = pricingInformation;
    }

    public ConfigurationLine withPricingInformation(PricingInformation pricingInformation) {
        this.pricingInformation = pricingInformation;
        return this;
    }

    @JsonProperty("ItemType")
    public String getItemType() {
        return itemType;
    }

    @JsonProperty("ItemType")
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public ConfigurationLine withItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    @JsonProperty("InstallSiteLocation")
    public InstallSiteLocation getInstallSiteLocation() {
        return installSiteLocation;
    }

    @JsonProperty("InstallSiteLocation")
    public void setInstallSiteLocation(InstallSiteLocation installSiteLocation) {
        this.installSiteLocation = installSiteLocation;
    }

    public ConfigurationLine withInstallSiteLocation(InstallSiteLocation installSiteLocation) {
        this.installSiteLocation = installSiteLocation;
        return this;
    }

    @JsonProperty("LeadTime")
    public LeadTime getLeadTime() {
        return leadTime;
    }

    @JsonProperty("LeadTime")
    public void setLeadTime(LeadTime leadTime) {
        this.leadTime = leadTime;
    }

    public ConfigurationLine withLeadTime(LeadTime leadTime) {
        this.leadTime = leadTime;
        return this;
    }

    @JsonProperty("ProductAttributes")
    public ProductAttributes getProductAttributes() {
        return productAttributes;
    }

    @JsonProperty("ProductAttributes")
    public void setProductAttributes(ProductAttributes productAttributes) {
        this.productAttributes = productAttributes;
    }

    public ConfigurationLine withProductAttributes(ProductAttributes productAttributes) {
        this.productAttributes = productAttributes;
        return this;
    }

    @JsonProperty("ConfigurationRecommendationAttributes")
    public ConfigurationRecommendationAttributes getConfigurationRecommendationAttributes() {
        return configurationRecommendationAttributes;
    }

    @JsonProperty("ConfigurationRecommendationAttributes")
    public void setConfigurationRecommendationAttributes(ConfigurationRecommendationAttributes configurationRecommendationAttributes) {
        this.configurationRecommendationAttributes = configurationRecommendationAttributes;
    }

    public ConfigurationLine withConfigurationRecommendationAttributes(ConfigurationRecommendationAttributes configurationRecommendationAttributes) {
        this.configurationRecommendationAttributes = configurationRecommendationAttributes;
        return this;
    }

    @Override
	public String toString() {
		return "ConfigurationLine [lineNumber=" + lineNumber + ", parentID=" + parentID + ", description=" + description
				+ ", quantity=" + quantity + ", itemName=" + itemName + ", pricingInformation=" + pricingInformation
				+ ", itemType=" + itemType + ", installSiteLocation=" + installSiteLocation + ", leadTime=" + leadTime
				+ ", productAttributes=" + productAttributes + ", configurationRecommendationAttributes="
				+ configurationRecommendationAttributes + ", additionalProperties=" + additionalProperties + "]";
	}

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ConfigurationLine withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lineNumber).append(parentID).append(description).append(quantity).append(itemName).append(pricingInformation).append(itemType).append(installSiteLocation).append(leadTime).append(productAttributes).append(configurationRecommendationAttributes).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationLine) == false) {
            return false;
        }
        ConfigurationLine rhs = ((ConfigurationLine) other);
        return new EqualsBuilder().append(lineNumber, rhs.lineNumber).append(parentID, rhs.parentID).append(description, rhs.description).append(quantity, rhs.quantity).append(itemName, rhs.itemName).append(pricingInformation, rhs.pricingInformation).append(itemType, rhs.itemType).append(installSiteLocation, rhs.installSiteLocation).append(leadTime, rhs.leadTime).append(productAttributes, rhs.productAttributes).append(configurationRecommendationAttributes, rhs.configurationRecommendationAttributes).append(additionalProperties, rhs.additionalProperties).isEquals();
    }
    
    

}
