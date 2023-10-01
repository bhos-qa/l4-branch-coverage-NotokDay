package org.example;

import java.io.IOException;
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

    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = multiply(result, i);
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

        //vulnerable to SQLi
        String sql = "SELECT * FROM users WHERE id=" + id + " LIMIT 1";
        //execute

        String result = "";
        return "done";
    }

    public long fibonacci(int n) {
        long[] fibonacci = new long[n + 1];

        fibonacci[0] = 0;
        fibonacci[1] = 1;
        fibonacci[2] = 1;

        for (int i = 2; i <= n; i++) {
            fibonacci[i] = add(fibonacci[i - 1], fibonacci[i - 2]);
        }

        return fibonacci[n];
    }

    public double power(double base, double exponent) {return Math.pow(base, exponent);}
    public void vulnFunc(String userInput) throws IOException { Process process = Runtime.getRuntime().exec("echo " + userInput); }
    public int multiply(int a, int b)
    {
        int result = a*b;
        return result;
    }
    public String greet(String username){return "<h1>Welcome " + username + "</h1>";} //vulnerable to xss
    public long add(long a, long b)
    {
        long result = a+b;
        return result;
    }
}
