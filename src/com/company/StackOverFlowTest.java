package com.company;

public class StackOverFlowTest {
    static int count;

    public static void test() {
        try {
            count++;
            System.out.println(count);
            test();
        } catch (StackOverflowError e) {
            System.out.println("Error!!!");
        }

    }

    public static void main(String[] args) {
        test();
    }
}
