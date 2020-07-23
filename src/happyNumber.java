
/*
happyNumber.java

The purpose of this java file is to take an inputted integer from the user and determine if that number is a "happy number". A number
is happy if the sum of each digit squared is equal to 1. If result is 0, then the number is not happy.
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;

public class happyNumber {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Input a positive integer to check if it is happy or not:");

        int input = inputReader.nextInt();
        checkIfHappy(input);


        //System.out.println("Input: " + input);
    }

    public static void checkIfHappy(int number) {
        String numString = Integer.toString(number);

        int[] digits = new int[numString.length()];
        for (int i = 0; i < numString.length(); i++) {
            digits[i] = numString.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(digits));

        for (int j = 0; j < digits.length; j++) {
            int numFromIndex = digits[j];
            int squared = numFromIndex * numFromIndex;
            digits[j] = squared;
        }
        System.out.println(Arrays.toString(digits));

        int sumOfDigits = 0;
        for(int k = 0; k < digits.length; k++) {
            sumOfDigits = sumOfDigits + digits[k];
        }
        System.out.println("Sum of digits is: " + sumOfDigits);
    }

//    public static Boolean checkIfInt (int number) {
//        String inputText = Integer.toString(number);
//        if (inputText.matches("^[0-9]*[1-9][0-9]*$")) {
//            return true;
//        } else {
//            return false;
//        }
//    }

}