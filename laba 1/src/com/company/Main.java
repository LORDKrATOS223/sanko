package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input count of elements: ");
        String[] mas = new String[inputArr()];
        System.out.println("Input a word: ");
        for (int i=0;i<mas.length;i++){
            mas[i]=inputSTR();
        }
        for (int i = 0; i<mas.length; i++){
            String s = mas[i];
            String s1 = reverseString(s);
            if (isPalindrome(s, s1) == true)
            {
                System.out.println(s);
            }
        }
    }

    public static int inputArr() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }

    public static String inputSTR() {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        return num;
    }


    public static String reverseString(String s)
    {
        String e = "";
        for (int i = s.length() - 1; i >= 0; i--) { //Возвращаем строку
            e += s.charAt(i);
        }
        return e;
    }

    public static boolean isPalindrome(String s, String s1) //Переворачивую строку
    {
        s1 = reverseString(s);
        if (s.equals(s1)) {
            return true;
        }
        return false;
    }
}
