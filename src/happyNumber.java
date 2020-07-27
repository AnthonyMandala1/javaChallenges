
/*
happyNumber.java

The purpose of this java file is to take an inputted integer from the user and determine if that number is a "happy number". A number
is happy if the sum of each digit squared is equal to 1. If result is 0, then the number is not happy.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class happyNumber {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("A happy number is a number where the sum of each digit squared is equal to 1. If the result loops back to the starting number");
        System.out.println("then it is not a happy number.\n");
        System.out.println("Input a positive integer to check if it is happy or not:");

        int input = inputReader.nextInt();
        checkIfHappy(input);

    }

    public static void checkIfHappy(int number) {
        // set the first number for check later outside loop
        int firstNum = number;
        ArrayList<Integer> checkedSums = new ArrayList();

        while(number != 1) { // run until happy or repeat
            String numString = Integer.toString(number);
            int[] digits = new int[numString.length()];
            for (int i = 0; i < numString.length(); i++) {
                digits[i] = numString.charAt(i) - '0';
            }
            //System.out.println(Arrays.toString(digits));

            for (int j = 0; j < digits.length; j++) {
                int numFromIndex = digits[j];
                int squared = numFromIndex * numFromIndex;
                System.out.println(digits[j] + "^2 is: " + squared);
                digits[j] = squared;
            }
            //System.out.println(Arrays.toString(digits));

            int sumOfDigits = 0;
            for(int k = 0; k < digits.length; k++) {
                sumOfDigits = sumOfDigits + digits[k];
            }

            number = sumOfDigits;
            System.out.println("Sum of digits is: " + sumOfDigits);


            if(sumOfDigits == firstNum || checkedSums.contains(sumOfDigits)) {  // || sum of digits is in list already
                System.out.println(firstNum + " is not happy");
                break;
            } else if (sumOfDigits == 1) {
                System.out.println(firstNum + " is happy");
                number = 1;
            }
            checkedSums.add(sumOfDigits);
        }

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