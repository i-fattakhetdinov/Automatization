package com.company;

public class SomeClass {

    public static int sum(int a, int b) {
        return (a) + (b);
    }

    public static boolean sumMoreThan10(int a, int b) {
        return ((a) + (b)) > 10;
    }

    public static int factorial(int n){
        int res = 1;
        for (int i = 1; i <= n; i++){
            res *= i;
        }
        return res;
    }

    public static boolean isSummerMonth(String month){
        if (month.equals("June") || month.equals("July") || month.equals("August")) {
            return true;
        }
        return false;
    }
}