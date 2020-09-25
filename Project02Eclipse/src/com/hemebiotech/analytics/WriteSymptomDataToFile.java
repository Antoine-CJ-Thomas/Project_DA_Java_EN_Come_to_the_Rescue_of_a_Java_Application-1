package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;

public class WriteSymptomDataToFile implements ISymptomWriter {

	private String filepath;

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
