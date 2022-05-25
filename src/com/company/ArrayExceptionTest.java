package com.company;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] array = new int[]{10, 28, 4, 198, 333, 1};
        System.out.println("Task 1. Test 1: ");
        printArray(array, 0, 5);

        System.out.println();
        System.out.println("Task 1. Test 2: ");
        printArray(array, 4, 8);

        System.out.println();
        System.out.println("Task 1. Test 3: ");
        printArray(array, -2, 3);
    }

    public static void printArray(int[] array, int start, int end) {
        for (int i = start; i <= end; i++) {
            try {
                System.out.print(array[i] + " ");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\nError!!! Program is trying to access a non-existent index. Current index = " + i +
                        "; Array length = " + array.length + ";");
            }
        }
    }
}
