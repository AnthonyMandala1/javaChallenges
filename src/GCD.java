/*
    GCD.java
    The purpose of this class is to take a set of numbers and figure out the greatest common denominator of each
 */

import java.util.ArrayList;
import java.util.Scanner;
public class GCD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();

        System.out.println("This program allows you to find the greatest common factor of three integers");
        System.out.println("Please enter your numbers");
        System.out.println("Num 1:");
        numList.add(input.nextInt());

        System.out.println("Num 2:");
        numList.add(input.nextInt());

        System.out.println("Num 3:");
        numList.add(input.nextInt());

        System.out.println("The final GCF is: " + findGCD(numList));
    }


    public static int findGCD(ArrayList<Integer> numbers) {
        int getMax = 0;
        getMax = numbers.get(0);
        for (int j = 0; j < numbers.size(); j++) {
            if (numbers.get(j) >= getMax) {
                getMax = numbers.get(j);
            } else if(numbers.get(j) <= getMax){
                j++;
            }
        }
        //aSystem.out.println(getMax);
        int gcf = 1; //lowest possible gcf is 1, only change if a new GCF is found
        for (int i = 2; i <= getMax; i++) { //GCD logic
            if(numbers.get(0) % i == 0 && numbers.get(1) % i == 0 && numbers.get(2) % i == 0) {
                gcf = i;
                System.out.println("New GCF is: " + gcf);
            } else {
                i++;
            }
        }
        return gcf;
    }


}
