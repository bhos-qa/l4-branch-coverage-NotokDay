package org.example;

import java.util.Scanner;

public class VulnerableClass {
    //safe
    public int add(int a, int b) {
        return a + b;
    }
    //safe
    public int subtract(int a, int b) {
        return a - b;
    }

   //safe
    public int multiply(int a, int b) {
        return a * b;
    }

    // safe
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // safe
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // vulnerable to SQLi
    public String vulnerableDatabaseQuery(String userInput) {
        String query = "SELECT * FROM products WHERE name = '" + userInput + "';";
        return query;
    }

    //safe
    public double squareRoot(int a) {
        return Math.sqrt(a);
    }
    //safe
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    //safe
    public int absoluteValue(int a) {
        return Math.abs(a);
    }
    //safe
    public boolean isEven(int a) {
        return a % 2 == 0;
    }
}
