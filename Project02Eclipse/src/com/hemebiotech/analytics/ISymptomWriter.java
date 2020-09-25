package com.hemebiotech.analytics;

import java.util.TreeMap;

/**
 * The wrote result will not contain duplications of the same symptom
 * 
 * The result must be ordered alphabetically
 */
public interface ISymptomWriter {
	
	/**
	 * Write all symptoms name and their value in a file
	 * 
	 * @param symptomTable contain the type and the value of each symptom
	 */
	void writeSymptoms(TreeMap<String, Integer> symptomTable);
}
