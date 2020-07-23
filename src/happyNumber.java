
/*
happyNumber.java

The purpose of this java file is to take an inputted integer from the user and determine if that number is a "happy number". A number
is happy if the sum of each digit squared is equal to 1. If result is 0, then the number is not happy.
 */

import java.util.Scanner;

public class happyNumber {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Input a integer to check if it is happy or not:");
        int input = inputReader.nextInt();

        ifHappy(input);

        //System.out.println("Input: " + input);
    }

    public static void ifHappy(int number) {

    }

}