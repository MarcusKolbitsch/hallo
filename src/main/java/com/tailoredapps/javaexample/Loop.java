package com.tailoredapps.javaexample;

public class Loop {
    public static void main(String[] args) {
        String name = "Marcus";
        for(int i = 0; i < name.length(); i++){
            System.out.println(name);
        }

        System.out.println();

        int x = 0;
        for(int i = 1; i <=100; i++){
            x += i;
        }
        System.out.println(x);

        System.out.println();


        for(int i = 0; i <= 100; i++){
            if(i == 0){
                System.out.println(i);
            }
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
