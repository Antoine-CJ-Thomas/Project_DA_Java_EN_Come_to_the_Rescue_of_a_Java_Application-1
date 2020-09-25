package com.hemebiotech.analytics;

import java.util.TreeMap;

/**
 * This class processes a list of symptoms and then ask to writes the result of
 * this treatment in another file
 */
public class AnalyticsCounter {

	private ReadSymptomDataFromFile symptomReader;
	private WriteSymptomDataToFile symptomWriter;

	private TreeMap<String, Integer> symptomTreeMap = new TreeMap<String, Integer>();

	/**
	 * @param filePathIn  a full or partial path to file with symptom strings in it
	 * @param filePathOut a full or partial path to file that will contain the
	 *                    process result
	 */
	public AnalyticsCounter(String filePathIn, String filePathOut) {

		symptomReader = new ReadSymptomDataFromFile(filePathIn);
		symptomWriter = new WriteSymptomDataToFile(filePathOut);
	}

	/**
	 * This method extract the different symptoms from a list and count the number
	 * of occurrence of each of them, then ask to write the result in a file
	 */
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
