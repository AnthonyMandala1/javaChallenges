/*
    fibonacci.java
    This class returns the nth number of the fibonacci sequence
 */

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of iterations of the fibonacci sequence you want:");

        int inNum = input.nextInt();
        System.out.println(fibonacci(inNum));
    }

    public static int fibonacci(int number) {
        //Recursive function, if the number is 0 or 1, t=just return it
        int currNum = number;
        if (number <= 1) {
            return number;
        }
        //else, the next number in the sequence is the sum of the previous 2 of FS
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}

