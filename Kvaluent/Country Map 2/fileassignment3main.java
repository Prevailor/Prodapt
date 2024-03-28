package com.assignmentk;
import java.util.Map;
public class fileassignment3main {
	
	    public static void main(String[] args) {
	        String filePath = "D:\\fileinput\\country 2.csv"; // Change to the path of your CSV file
	        Map<String, String> countryCapitalMap = fileasssignment3.loadCsvFileToMap(filePath);
	        char startsWith = 'M'; // Example: Filter countries starting with 'A'
	        String outputFile = "D:\\filtered_countries.txt"; // Change to desired output file path
	        fileasssignment3.writeFilteredCountries(outputFile, countryCapitalMap, startsWith);
	        System.out.println("Filtered countries have been written to the file.");
	    }
	}