package com.assignmentk;

import java.io.*;
import java.util.*;

public class fileassignment1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String fol = sc.nextLine();
		String fil = sc.nextLine();
		File file = new File("D:\\" + fol);
		File file1 = new File("D:\\" + fol + "\\" + fil);
         
		 if (file1.isFile()) {
			System.out.println(file1);
		}
		 
		 else if (file.isDirectory()) {
			File[] filearray = file.listFiles();
			for (File fi : filearray) {
				System.out.println(fi);
			}
		}

		

		else {
			System.out.println("File not found");
		}

	}

}
