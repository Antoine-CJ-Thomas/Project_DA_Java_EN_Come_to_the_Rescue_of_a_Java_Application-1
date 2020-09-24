package com.hemebiotech.analytics;


public class Launcher {
	
	public static void main(String args[]) {

		ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");

		AnalyticsCounter analyzeSymptom = new AnalyticsCounter();
		analyzeSymptom.symptomCounting(readSymptom.getSymptoms());
		
		WriteSymptomDataFromFile writeSymptom = new WriteSymptomDataFromFile("Project02Eclipse/result.out");
		writeSymptom.writeSymptoms(analyzeSymptom.getSymptomList());
		
	}
}
