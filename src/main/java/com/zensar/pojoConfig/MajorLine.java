package com.zensar.pojoConfig;

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
@JsonIgnoreProperties
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "itemName",
    "itemType",
    "quantity",
    "unitListPrice",
    "extendedListPrice",
    "description",
    "orignalUnitListPrice",
    "serviceable",
    "additionalItemInfo",
    "selectionFlag",
    "status",
    "installSite",
    "flexServiceDuration",
    "extendedAttributes"
})
public class MajorLine {

    @JsonProperty("itemName")
    private String itemName;
    @JsonProperty("itemType")
    private String itemType;
    @JsonProperty("quantity")
    private String quantity;
    @JsonProperty("unitListPrice")
    private String unitListPrice;
    @JsonProperty("extendedListPrice")
    private String extendedListPrice;
    @JsonProperty("description")
    private String description;
    @JsonProperty("orignalUnitListPrice")
    private String orignalUnitListPrice;
    @JsonProperty("serviceable")
    private String serviceable;
    @JsonProperty("additionalItemInfo")
    private String additionalItemInfo;
    @JsonProperty("selectionFlag")
    private String selectionFlag;
    @JsonProperty("status")
    private String status;
    @JsonProperty("installSite")
    private InstallSite installSiteLocation;
    @JsonProperty("flexServiceDuration")
    private String flexServiceDuration;
    @JsonProperty("extendedAttributes")
    private ExtendedAttributes extendedAttributes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("itemName")
    public String getItemName() {
        return itemName;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

	@JsonProperty("itemName")
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public MajorLine withItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    @JsonProperty("itemType")
    public String getItemType() {
        return itemType;
    }

    @JsonProperty("itemType")
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public MajorLine withItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    @JsonProperty("quantity")
    public String getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public MajorLine withQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonProperty("unitListPrice")
    public String getUnitListPrice() {
        return unitListPrice;
    }

    @JsonProperty("unitListPrice")
    public void setUnitListPrice(String unitListPrice) {
        this.unitListPrice = unitListPrice;
    }

    public MajorLine withUnitListPrice(String unitListPrice) {
        this.unitListPrice = unitListPrice;
        return this;
    }

    @JsonProperty("extendedListPrice")
    public String getExtendedListPrice() {
        return extendedListPrice;
    }

    @JsonProperty("extendedListPrice")
    public void setExtendedListPrice(String extendedListPrice) {
        this.extendedListPrice = extendedListPrice;
    }

    public MajorLine withExtendedListPrice(String extendedListPrice) {
        this.extendedListPrice = extendedListPrice;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public MajorLine withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("orignalUnitListPrice")
    public String getOrignalUnitListPrice() {
        return orignalUnitListPrice;
    }

    @JsonProperty("orignalUnitListPrice")
    public void setOrignalUnitListPrice(String orignalUnitListPrice) {
        this.orignalUnitListPrice = orignalUnitListPrice;
    }

    public MajorLine withOrignalUnitListPrice(String orignalUnitListPrice) {
        this.orignalUnitListPrice = orignalUnitListPrice;
        return this;
    }

    @JsonProperty("serviceable")
    public String getServiceable() {
        return serviceable;
    }

    @JsonProperty("serviceable")
    public void setServiceable(String serviceable) {
        this.serviceable = serviceable;
    }

    public MajorLine withServiceable(String serviceable) {
        this.serviceable = serviceable;
        return this;
    }

    @JsonProperty("additionalItemInfo")
    public String getAdditionalItemInfo() {
        return additionalItemInfo;
    }

    @JsonProperty("additionalItemInfo")
    public void setAdditionalItemInfo(String additionalItemInfo) {
        this.additionalItemInfo = additionalItemInfo;
    }

    public MajorLine withAdditionalItemInfo(String additionalItemInfo) {
        this.additionalItemInfo = additionalItemInfo;
        return this;
    }

    @JsonProperty("selectionFlag")
    public String getSelectionFlag() {
        return selectionFlag;
    }

    @JsonProperty("selectionFlag")
    public void setSelectionFlag(String selectionFlag) {
        this.selectionFlag = selectionFlag;
    }

    public MajorLine withSelectionFlag(String selectionFlag) {
        this.selectionFlag = selectionFlag;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public MajorLine withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("installSite")
    public InstallSite getInstallSite() {
        return installSiteLocation;
    }

    @JsonProperty("installSite")
    public void setInstallSite(InstallSite installSite) {
        this.installSiteLocation = installSite;
    }

    public MajorLine withInstallSite(InstallSite installSite) {
        this.installSiteLocation = installSite;
        return this;
    }

    @JsonProperty("flexServiceDuration")
    public String getFlexServiceDuration() {
        return flexServiceDuration;
    }

    @JsonProperty("flexServiceDuration")
    public void setFlexServiceDuration(String flexServiceDuration) {
        this.flexServiceDuration = flexServiceDuration;
    }

    public MajorLine withFlexServiceDuration(String flexServiceDuration) {
        this.flexServiceDuration = flexServiceDuration;
        return this;
    }

    @JsonProperty("extendedAttributes")
    public ExtendedAttributes getExtendedAttributes() {
        return extendedAttributes;
    }

    @JsonProperty("extendedAttributes")
    public void setExtendedAttributes(ExtendedAttributes extendedAttributes) {
        this.extendedAttributes = extendedAttributes;
    }

    public MajorLine withExtendedAttributes(ExtendedAttributes extendedAttributes) {
        this.extendedAttributes = extendedAttributes;
        return this;
    }

    @Override
	public String toString() {
		return "MajorLine [itemName=" + itemName + ", itemType=" + itemType + ", quantity=" + quantity
				+ ", unitListPrice=" + unitListPrice + ", extendedListPrice=" + extendedListPrice + ", description="
				+ description + ", orignalUnitListPrice=" + orignalUnitListPrice + ", serviceable=" + serviceable
				+ ", additionalItemInfo=" + additionalItemInfo + ", selectionFlag=" + selectionFlag + ", status="
				+ status + ", installSiteLocation=" + installSiteLocation + ", flexServiceDuration="
				+ flexServiceDuration + ", extendedAttributes=" + extendedAttributes + ", additionalProperties="
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

    public MajorLine withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(itemName).append(itemType).append(quantity).append(unitListPrice).append(extendedListPrice).append(description).append(orignalUnitListPrice).append(serviceable).append(additionalItemInfo).append(selectionFlag).append(status).append(installSiteLocation).append(flexServiceDuration).append(extendedAttributes).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MajorLine) == false) {
            return false;
        }
        MajorLine rhs = ((MajorLine) other);
        return new EqualsBuilder().append(itemName, rhs.itemName).append(itemType, rhs.itemType).append(quantity, rhs.quantity).append(unitListPrice, rhs.unitListPrice).append(extendedListPrice, rhs.extendedListPrice).append(description, rhs.description).append(orignalUnitListPrice, rhs.orignalUnitListPrice).append(serviceable, rhs.serviceable).append(additionalItemInfo, rhs.additionalItemInfo).append(selectionFlag, rhs.selectionFlag).append(status, rhs.status).append(installSiteLocation, rhs.installSiteLocation).append(flexServiceDuration, rhs.flexServiceDuration).append(extendedAttributes, rhs.extendedAttributes).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
