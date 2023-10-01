package org.example;

import java.util.Scanner;

public class VulnerableClass {
    //safe
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }
    //safe
    public int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

   //safe
    public int multiply(int a, int b) {
        int result = a*b;
        return result;
    }

    // safe
    public int divide(int a, int b) {
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
    public String vulnerableDatabaseQuery(String username, String password) {
        String sql = "SELECT * FROM users WHERE username='" + username + "' AND password='" + password + "'";
        return sql;
    }

    //safe
    public double squareRoot(int a) {
        double result = Math.sqrt(a);
        return result;
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
