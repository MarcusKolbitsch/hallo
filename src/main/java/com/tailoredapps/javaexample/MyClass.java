package com.tailoredapps.javaexample;

public class MyClass {

    public static void main(String[] args) {

        System.out.println("Hello World");

        String x = "Hallo";
        String y = "Marcus";

        x = x.toLowerCase();
        y = y.toUpperCase();

        String z = x + y;

        int length = z.length();

        System.out.println(z);
        System.out.println(length);
    }
}
