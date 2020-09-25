package com.hemebiotech.analytics;

/**
 * This class launch the application
 */
public class Launcher {
	
	public static void main(String args[]) {

		AnalyticsCounter analyzeSymptom = new AnalyticsCounter("Project02Eclipse/symptoms.txt","Project02Eclipse/result.out");
		analyzeSymptom.symptomCounting();	
	}
}
