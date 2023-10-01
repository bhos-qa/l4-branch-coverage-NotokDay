package org.example;

import java.util.Scanner;

public class VulnerableClass {
    public static String reverse(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Swap characters at left and right positions
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }

        return new String(chars);
    }

    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters at the current positions do not match
            }
            left++;
            right--;
        }

        return true; // All characters matched, it's a palindrome
    }

   //safe
    public int multiply(int a, int b) {
        int result = a*b;

        vulnerableDatabaseQuery(a);
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
    public String vulnerableDatabaseQuery(int id) {
        return "SELECT * FROM users WHERE id="+id;
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
