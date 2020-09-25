package com.hemebiotech.analytics;

import java.util.TreeMap;

public class AnalyticsCounter {

	private ReadSymptomDataFromFile symptomReader;
	private WriteSymptomDataToFile symptomWriter;

	private TreeMap<String, Integer> symptomTreeMap = new TreeMap<String, Integer>();

	public AnalyticsCounter(String filePathIn, String filePathOut) {

		symptomReader = new ReadSymptomDataFromFile(filePathIn);
		symptomWriter = new WriteSymptomDataToFile(filePathOut);
	}

	public void symptomCounting() {

		for (String s : symptomReader.getSymptoms()) {

			if (symptomTreeMap.containsKey(s) == false) {

				symptomTreeMap.put(s, 1);
			}

			else {

				symptomTreeMap.put(s, symptomTreeMap.get(s) + 1);
			}
		}

		symptomWriter.writeSymptoms(symptomTreeMap);
	}
}
