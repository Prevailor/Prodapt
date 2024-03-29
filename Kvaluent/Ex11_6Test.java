package com.assignmentk;

public class Ex11_6Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex11_6 instanceA = new Ex11_6();
		 
		Ex11_6 instanceB = new Ex11_6();
		 
		instanceA.a = 8;
		 
		instanceB.b = instanceA.x;
		 
		instanceA.x++;
		 
		instanceB.a = 10;
		 
		instanceB.c = 90;
		 
		instanceB.x++;
		
		System.out.println("a: "+instanceA.a);
		System.out.println("b: "+instanceA.b);
		System.out.println("c: "+instanceA.c);
		System.out.println("x: "+instanceA.x);
		System.out.println("******************************");
		System.out.println("a: "+instanceA.a);
		System.out.println("b: "+instanceA.b);
		System.out.println("c: "+instanceA.c);
		System.out.println("x: "+instanceA.x);
		 
		 
		 
		
		

	}

}
