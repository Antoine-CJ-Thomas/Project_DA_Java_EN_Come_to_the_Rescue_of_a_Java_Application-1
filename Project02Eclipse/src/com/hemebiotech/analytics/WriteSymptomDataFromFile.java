package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class WriteSymptomDataFromFile implements ISymptomWriter {

	private String filepath;

	public WriteSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	@Override
	public void writeSymptoms(TreeMap<String, Integer> symptomHashMap) {

		try {

			FileWriter writer = new FileWriter(filepath);

			for (int i = 0; i < symptomHashMap.size(); i++) {
								
				System.out.println(symptomHashMap.keySet().toArray()[i] + " : " + symptomHashMap.values().toArray()[i]);

				writer.write(symptomHashMap.keySet().toArray()[i] + " : " + symptomHashMap.values().toArray()[i] + "\n");
			}

			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
