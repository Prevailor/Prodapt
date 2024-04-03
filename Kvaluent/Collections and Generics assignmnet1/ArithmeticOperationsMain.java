package com.assignmentk;

import java.util.Vector;

public class ArithmeticOperationsMain {
	public static void main(String[] args) {
	Integer i1 = new Integer(34), i2 = new Integer(43);
	System.out.println("Add with generic method: " + ArithmeticOperations.add(i1, i2));
	Float f1 = new Float(12.56), f2 = new Float(3.6778);
	System.out.println("Add with generic method: " + ArithmeticOperations.add(f1, f2));

	System.out.println("Subtraction with generic method: " + ArithmeticOperations.sub(f1, f2));
	System.out.println("Division with generic method: " + ArithmeticOperations.div(f1, f2));
	// Adding 2 integers through a list
	Vector<Number> l = new Vector<Number>();
	l.add(new Integer(34));
	l.add(new Integer(43));
	System.out.println("Add with upper bounded wildcard: " + ArithmeticOperations.add(l));

	// Dumping the list to the console.
	ArithmeticOperations.dumpList(l);
}
}