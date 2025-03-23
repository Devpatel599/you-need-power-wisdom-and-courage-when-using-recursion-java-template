package org.example;

public class App {
    public static void main(String[] args) {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();

        System.out.println(calculator.value(1)); // This should print out 1
        System.out.println(calculator.value(2)); // This should print out 3
        System.out.println(calculator.value(4)); // This should print out 10

        System.out.println(calculator.add(1, 1)); // This should print out 2
        System.out.println(calculator.add(2, 3)); // This should print out 9
        System.out.println(calculator.add(4, 2)); // This should print out 13

        System.out.println(calculator.subtract(1, 1)); // This should print out 0
        System.out.println(calculator.subtract(2, 3)); // This should print out -3
        System.out.println(calculator.subtract(4, 2)); // This should print out 7
    }
}

class TriangleNumberCalculator {
    // Recursive method to calculate the nth triangular number
    public int value(int n) {
        if (n <= 1) {
            return n;
        }
        return n + value(n - 1);
    }

    // Method to add the nth and mth triangular numbers
    public int add(int n, int m) {
        return value(n) + value(m);
    }

    // Method to subtract the nth and mth triangular numbers
    public int subtract(int n, int m) {
        return value(n) - value(m);
    }
}
