package com.company;

import java.util.Scanner;


/*
Challenge:
Build  main program with two input parameters that print numbers between those two numbers
Eg. Input 1 = 3
    Input 2 = 6

Print 4 , 5

1. Create scanner to take in 2 values
2. Check if those values are within your range
3. Resolve edge cases to make sure you cannot pick up either min or max
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Please input a 'min' value hit 'enter' and then input a 'max' value: ");

        Scanner myObj = new Scanner(System.in);

        int min = 3;  // myObj.nextInt();
        int max = 5;  // myObj.nextInt();

        for (int i = 0; i < 2; i++) {
            System.out.println(getRandomNumberInRange(min, max));
        }
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        //return (int) (Math.random() * (((max - 1) - min) + 1) + (min + 1));

        //Figuring out how to not allow the min or max value be included or if the same value eg min=3 max=6 value1=3 value2=3
        int a = (int) (Math.random() * (((max - 1) - min) + 1) + (min + 1));
        int b = (int) (Math.random() * (((max - 1) - min) + 1) + (min + 1));

        if (a == b) {
            if(b>max)
            {
                return b - 1;
            }
            if(b<min){
                return b + 1;
            }
            if(a>max){
                return a - 1;
            }
            if(a<min){
                return a + 1;
            }

//            if (a < max - 1 && a > min +1) {
//                return b - 1;
//            }
//            if (b > min && b < max - 1) {
//                return a - 1;
//            }
        }
        return b;

    }
}








// ATTEMPT 1:
//int max = 6;
//int min = 3;
//
//Random randomNum = new Random();
//
//int showMe = min + randomNum.nextInt(max);
//
//        System.out.println(showMe);
//
//        Random randomNum2 = new Random();
//
//int showMe2 = min + randomNum2.nextInt(max);
//
//        System.out.println(showMe2);

//ATTEMPT 2:
//        Random r = new Random();
//        int low = 3;
//        int high = 6;
//        int result = r.nextInt(high-low) + low;
//        int result2 = r.nextInt(high-low) + low;
//
//        System.out.println(result);
//        System.out.println(result2);





