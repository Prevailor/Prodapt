package com.assignmentk;
import java.util.*;
public class Stringnumanddigit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123";
		int f=0;
		int st=0;
		for (int i=0;i<s.length();i++) {
			if((s.charAt(i)>=65 && s.charAt(i)<=90) ||(s.charAt(i)>=97 && s.charAt(i)<=122)){
				st=1;

			}
			if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				f=1;
			}

		}
		 if(st==0) {
				System.out.println("it contains only numbers");
			}
		 else if(f==0) {
			System.out.println("it contains only strings");
		}
		else if(f==1) {
			System.out.println("it contains numbers and strings");
		}
		

}
}
