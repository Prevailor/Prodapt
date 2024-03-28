package com.assignmentk;

import java.util.Map;

public class fileassignment2main {
	
		   public static void main(String[] args) {
		       String filePath = "D:/fileinput/country 2.csv"; // Change to the path of your CSV file
		       Map<String, String> countryCapitalMap = fileassignment2.loadCsvFileToMap(filePath);
		       for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
		           System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
		       }
		   }
		}


