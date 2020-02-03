package com.zensar;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zensar.pojoB2B.B2BResponse;
import com.zensar.pojoB2B.ConfigurationLine;
import com.zensar.pojoConfig.ConfigResponse;
import com.zensar.pojoConfig.MajorLine;

public class App {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		B2BResponse response = new B2BResponse();
		ConfigurationLine cl = new ConfigurationLine();
		ConfigResponse conResponse = new ConfigResponse();
		response = getB2BResponse();
		conResponse = getConfigResponse();
		List<B2BResponse> list = new ArrayList<B2BResponse>();
		for (ConfigurationLine configurationLine : response.getConfigurationLine()) {
			MajorLine majorLine = null;
			for (MajorLine line : conResponse.getMajorLine()) {
				if (configurationLine.getItemName().contentEquals(line.getItemName())) {
					majorLine = line;
					break;
				}
			}
			if (majorLine != null) {
				List<CompareResult> compareResults = ResponseComparator.compareConfigMajorLineResponse(majorLine,configurationLine);
				if (!compareResults.isEmpty()) {
					System.out.println("Found Difference");
					for (CompareResult compareResult : compareResults) {
						System.out.println(compareResult.getItemName());
						System.out.println(compareResult.getPropertyName());
						System.out.println(compareResult.getValue1());
						System.out.println(compareResult.getValue2());
						System.out.println("******************************************");
					}
				}
			}
		}
	}

	private static B2BResponse getB2BResponse() throws JsonParseException, JsonMappingException, IOException {
		B2BResponse b2BResponse = null;
		ObjectMapper mapper = new ObjectMapper();
		b2BResponse = mapper.readValue(new File("Assets/B2B.txt"), B2BResponse.class);
		return b2BResponse;
	}

	private static ConfigResponse getConfigResponse() throws JsonParseException, JsonMappingException, IOException {
		ConfigResponse configResponse = null;
		ObjectMapper mapper = new ObjectMapper();
		configResponse = mapper.readValue(new File("Assets/ConfigResponse.txt"), ConfigResponse.class);
		return configResponse;
	}
}
