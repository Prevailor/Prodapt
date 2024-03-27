package com.assignmentk;

public class Anagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="parliment";
		String s2="partial men";
		int f=0;
		for(int i=0;i<s2.length();i++) {
			f=0;
			for(int j=0;j<s1.length();j++) {
				if(s2.charAt(i)==' ') {
					f=1;
					
				}
				else if(s2.charAt(i)==s1.charAt(j)) {
					f=1;
					break;
					
				}
			}
			if(f==0) {
				System.out.print("Not an anagram");
				break;
			}
		}
		if(f==1){
			System.out.print("anagram");
		}

	}

}
