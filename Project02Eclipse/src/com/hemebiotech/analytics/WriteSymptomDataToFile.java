package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * This class write the symptom process result in a file (Simple brute force
 * implementation)
 */
public class WriteSymptomDataToFile implements ISymptomWriter {

	private String filepath;

	/**
	 * @param filepath a full or partial path to file that will contain the process
	 *                 result
	 */
	public WriteSymptomDataToFile(String filepath) {
		this.filepath = filepath;
	}

	@Override
	public void writeSymptoms(TreeMap<String, Integer> symptomTreeMap) {

		try {

			FileWriter writer = new FileWriter(filepath);

			for (Entry<String, Integer> entry : symptomTreeMap.entrySet()) {

				System.out.println(entry.getKey() + " : " + entry.getValue());

				writer.write(entry.getKey() + " : " + entry.getValue() + "\n");
			}

			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
