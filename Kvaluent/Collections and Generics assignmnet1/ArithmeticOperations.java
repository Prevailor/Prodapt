package com.assignmentk;
import java.util.List;
import java.util.Vector;	 
	/**
	* Supports arithmetic operations of +, -, *, / on any type that are subclasses
	* of {@link java.lang.Number}.
	*
	* @author pchandra
	*
	*/
	public class ArithmeticOperations {
		/**
		 * Generic method to add 2 numbers.
		 *
		 * @param t1
		 * @param t2
		 * @return
		 */
		public static <T extends Number> Number add(T t1, T t2) {
			return (t1.doubleValue() + t2.doubleValue());
		}
	 
		/**
		 * Demostrates Upper Bounded Wildcards. Generic method to add numbers from a
		 * list.
		 *
		 * @param t1
		 * @param t2
		 * @return
		 */
		public static <T extends Number> Number sub(T t1, T t2) {
			return (t1.doubleValue() - t2.doubleValue());
		}
	 
		public static <T extends Number> Number div(T t1, T t2) {
			return (t1.doubleValue() / t2.doubleValue());
		}
	 
		public static <T extends Number> Number add(List<?extends Number> list) {
			double d = 0;
			;
			for (int i = 0; i < list.size(); i++)
				d += list.get(i).doubleValue();
	 
			return new Double(d);
		}
	 
		/**
		 * Demostrates Unbounded Wildcards. Generic method to dump list data to console.
		 *
		 * @param t1
		 * @param t2
		 * @return
		 */
		public static void dumpList(List list) {
			System.out.println("List dump with unbounded wildcard:");
			for (int i = 0; i < list.size(); i++)
				System.out.println(list.get(i));
		}
	 

}
