package com.company;

public class Palindrome {
    public Palindrome() {
    }

    public static void main(String[] args) {
        for(int i = 0; i < args.length; ++i) {
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(s);
            }
        }

    }

    public static String reverseString(String s) {
        String e = "";

        for(int i = s.length() - 1; i >= 0; --i) {
            e = e + s.charAt(i);
        }

        return e;
    }

    public static boolean isPalindrome(String s) {
        String s1 = reverseString(s);
        return s.equals(s1);
    }
}

