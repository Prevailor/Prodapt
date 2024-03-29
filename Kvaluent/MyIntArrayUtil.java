package com.assignmentk;
import java.util.Arrays;
import java.util.Random;
public class MyIntArrayUtil {
	
	public static void main(String[] args) {
        int[] myArray = generateRandomArray(10, 1, 100);
        System.out.println("Original array:");
        printArray(myArray);
        Arrays.sort(myArray);
        System.out.println("\nSorted array (ascending order):");
        printArray(myArray);
    }
    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
