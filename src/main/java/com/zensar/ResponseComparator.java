package com.zensar;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.Configuration;

import com.zensar.pojoB2B.ConfigurationLine;
import com.zensar.pojoB2B.PricingInformation;
import com.zensar.pojoConfig.MajorLine;

public class ResponseComparator {

	public static List<CompareResult> compareConfigMajorLineResponse(MajorLine majorLine, ConfigurationLine configurationLine) {
		List<CompareResult> compareResults = new ArrayList<CompareResult>();

		if (!majorLine.getItemType().equals(configurationLine.getItemType())) {
			compareResults.add(createCompareResult(majorLine.getItemName(), "ItemType",majorLine.getItemType(), configurationLine.getItemType(), false));
		}
		
		if(!majorLine.getDescription().equals(configurationLine.getDescription())) {
			compareResults.add(createCompareResult(majorLine.getItemName(), "Description",majorLine.getDescription(), configurationLine.getDescription(), false));

		}
		
		PricingInformation pricingInformation = configurationLine.getPricingInformation();
		if(pricingInformation != null) {
			if(!pricingInformation.getUnitListPrice().equals(majorLine.getUnitListPrice())) {
				compareResults.add(createCompareResult(majorLine.getItemName(), "UnitListPrice",majorLine.getUnitListPrice(), pricingInformation.getUnitListPrice(), false));
			}
			if(!pricingInformation.getExtendedListPrice().equals(majorLine.getExtendedListPrice())) {
				compareResults.add(createCompareResult(majorLine.getItemName(), "UnitListPrice",majorLine.getExtendedListPrice(), pricingInformation.getExtendedListPrice(), false));
			}
		}
		
		return compareResults;
	}
	
	private static CompareResult createCompareResult(String itemName, String propertyName, Object value1, Object value2, boolean result) {
		CompareResult compareResult = new CompareResult();
		compareResult.setItemName(itemName);
		compareResult.setPropertyName(propertyName);
		compareResult.setValue1(value1);
		compareResult.setValue2(value2);
		compareResult.setResult(false);
		return compareResult;
	}
}