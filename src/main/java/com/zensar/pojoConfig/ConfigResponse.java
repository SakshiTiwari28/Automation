
package com.zensar.pojoConfig;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "majorLine" })
@JsonIgnoreProperties({"errorFlag","requestId","stats"})
public class ConfigResponse implements Comparable {

	@JsonProperty("majorLine")
	private List<MajorLine> majorLine = new ArrayList<MajorLine>();

	@JsonProperty("majorLine")
	public List<MajorLine> getMajorLine() {
		return majorLine;
	}

	@JsonProperty("majorLine")
	public void setMajorLine(List<MajorLine> majorLine) {
		this.majorLine = majorLine;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(majorLine).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ConfigResponse) == false) {
			return false;
		}
		ConfigResponse rhs = ((ConfigResponse) other);
		return new EqualsBuilder().append(majorLine, rhs.majorLine).isEquals();
	}

	public int compareTo(Object o) {
		return 0;
	}

}
