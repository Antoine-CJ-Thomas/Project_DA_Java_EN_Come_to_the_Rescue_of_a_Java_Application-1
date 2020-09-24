package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {

	private TreeMap<String, Integer> symptomHashMap = new TreeMap<String, Integer>(); 

	public AnalyticsCounter() {

	}

	public void symptomCounting(List<String> inputList) {
		
		for (String s : inputList) {

			if (symptomHashMap.containsKey(s) == false) {

				symptomHashMap.put(s, 1);
			}
			
			else {
				
				symptomHashMap.put(s, symptomHashMap.get(s) + 1);
			}
		}
	}

	public TreeMap<String, Integer> getSymptomList() {

		return symptomHashMap;
	}
}
