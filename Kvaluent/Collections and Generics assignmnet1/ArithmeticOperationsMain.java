package com.assignmentk;

import java.util.Vector;

public class ArithmeticOperationsMain {
		public static void main(String[] args) {
	        // Adding 2 integers
	        Integer i1 = new Integer(34), i2 = new Integer(43);
	        System.out.println("Add with generic method: " + ArithmeticOperations.add(i1, i2));
	        // Subtracting 2 floats
	        Float f1 = new Float(12.56), f2 = new Float(3.6778);
	        System.out.println("Subtract with generic method: " + ArithmeticOperations.subtract(f1, f2));
	        // Dividing 2 integers
	        Integer i3 = new Integer(20), i4 = new Integer(5);
	        System.out.println("Divide with generic method: " + ArithmeticOperations.divide(i3, i4));
	        System.out.println(" ");
	        // Adding 2 integers through a list
	        Vector<Number> l = new Vector<>();
	        l.add(new Integer(34));
	        l.add(new Integer(43));
	        // Subtracting 2 integers through a list
	        Vector<Number> s = new Vector<>();
	        s.add(new Double(12.56));
	        s.add(new Float(3.6778));
	        //Dividing 2 integers through a list
	        Vector<Number> d = new Vector<>();
	        d.add(new Integer(20));
	        d.add(new Integer(5));
	        System.out.println("Add with upper bounded wildcard: " + ArithmeticOperations.add(l));
	        System.out.println("Sub with upper bounded wildcard: " + ArithmeticOperations.sub(s));
	        System.out.println("Division with upper bounded wildcard: " + ArithmeticOperations.div(d));
	        System.out.println(" ");
	        // Dumping the list to the console.
	        ArithmeticOperations.dumpList(l);
	        ArithmeticOperations.dumpList(s);
	        ArithmeticOperations.dumpList(d);
	    }
}