package com.assignmentk;

import java.util.List;
import java.util.Vector;
public class ArithmeticOperations{
    public static <T extends Number> Number add(T t1, T t2) {
        return (t1.doubleValue() + t2.doubleValue());
    }
    public static <T extends Number> Number subtract(T t1, T t2) {
        return (t1.doubleValue() - t2.doubleValue());
    }
    public static <T extends Number> Number divide(T t1, T t2) {
        if (t2.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return (t1.doubleValue() / t2.doubleValue());
    }
    public static Number add(List<? extends Number> list) {
        double d = 0;
        for (int i = 0; i < list.size(); i++) {
            d += list.get(i).doubleValue();
        }
        return new Double(d);
    }
    public static Number sub(List<? extends Number> list) {
        double d = list.get(0).doubleValue();
        for (int i = 1; i < list.size(); i++) {
            d -= list.get(i).doubleValue();
        }
        return new Double(d);
    }
    public static Number div(List<? extends Number> list) {
        double d = list.get(0).doubleValue();
        for (int i = 1; i < list.size(); i++) {
            d /= list.get(i).doubleValue();
        }
		return new Double(d);
    }
    public static void dumpList(List<?> list) {
        System.out.println("List dump with unbounded wildcard:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    
}
