package com.zensar.pojoB2B;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "ConfigurationLine" })
@JsonIgnoreProperties({"Sender","Receiver","CreationDateTime","BODID","ResponseStatus"})
public class B2BResponse implements Comparable {

	@JsonProperty("ConfigurationLine")
	private List<ConfigurationLine> configurationLine;// = new ArrayList<ConfigurationLine>();

	@JsonProperty("ConfigurationLine")
	public List<ConfigurationLine> getConfigurationLine() {
		return configurationLine;
	}

	@JsonProperty("ConfigurationLine")
	public void setConfigurationLine(List<ConfigurationLine> configurationLine) {
		this.configurationLine = configurationLine;
	}

	public B2BResponse withConfigurationLine(List<ConfigurationLine> configurationLine) {
		this.configurationLine = configurationLine;
		return this;
	}

	@Override
	public String toString() {
		return "B2BResponse [configurationLine=" + configurationLine + "]";
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof B2BResponse) == false) {
			return false;
		}
		B2BResponse rhs = ((B2BResponse) other);
		return true;
	}

	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
