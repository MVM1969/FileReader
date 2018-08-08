package com.mvm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FileRead {

	/** The log4j object used for logging information and errors **/

	public void getFiledata(String sqlText, String[] requiredValues) throws Exception {

		String filename = "Nothing";
		String csvFile = "C:/temp/FileName.ext";
		String outputFile = "FilenameToWriteTo.ext";
		// String csvFile = "D:/BIVV/PR_IDs.csv";
		String line = "";
		String delimiter = " ";
		List<String> prIDs = new ArrayList<String>();
		int index = 0;
		ResultSet rs = null;
		OutputStream out = null;
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			System.out.println("Delimiter=" + delimiter);
			while ((line = br.readLine()) != null) {

				String[] prID = line.split(delimiter);
				if (prID[0].equals("PR_ID"))
					continue;
				prIDs.add(prID[0]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
