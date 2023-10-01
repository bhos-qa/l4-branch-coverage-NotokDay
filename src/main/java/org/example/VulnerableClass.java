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


    //vulnerable to XSS
    public String greet(String username){
        String greetingMessage = "<h1>Welcome " + username + "</h1>";
        return greetingMessage;
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
        String DATABASE_USER = "root";
        String DATABASE_PASSWORD = "OIPnCRwxW1zpi";
        String DATABASE_HOST = "127.0.0.1";
        String DATABASE_DB = "test";
        //connect to db

        String sql = "SELECT * FROM users WHERE id="+id;
        //execute
        String result = "";
        return "done";
    }


    public long fibonacci(int n) {
        long[] fibonacci = new long[n + 1];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci[n];
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public int absoluteValue(int a) {
        return Math.abs(a);
    }

    public int multiply(int a, int b) {
        return a*b;
    }
}
