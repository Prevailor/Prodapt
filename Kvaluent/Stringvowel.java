package com.assignmentk;
import java.util.*;
public class Stringvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="azhar hussain";
		int vo=0;
		int c=0;
		int f=0;
		char[] v= {'a','e','i','o','u'};
		for(int i=0;i<s.length();i++) {
			f=0;
			for(int j=0;j<v.length;j++) {
				if(s.charAt(i)==v[j]) {
					vo+=1;
					f=1;
					break;
					
				}
			}
			if(f==0) {
				c+=1;
				
			}
		}
		System.out.println("no.of vowels "+vo);
		System.out.println("no.of constants "+c);
		

		
	}

}
