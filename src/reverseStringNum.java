import java.util.Scanner;
import java.lang.StringBuilder;

public class reverseStringNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word to reverse:");
        String stringInput = input.nextLine();


        System.out.println("Enter a integer to reverse:");
        int intInput = input.nextInt();

        wordReverse(stringInput);
        intReverse(intInput);

    }

    public static void wordReverse(String theString) {
        // using the StringBuilder class is useful with built in reverse command
        StringBuilder theNewString = new StringBuilder(theString);
        theNewString = theNewString.reverse();

        System.out.println("Reversed string: " + theNewString);
    }

    public static void intReverse(int theInt) {
        int revNum = 0;
        while(theInt != 0) { // as long as the int passed in is not 0, get the last digit of theInt each time
            revNum = revNum * 10;
            revNum = revNum + theInt % 10;
            theInt = theInt / 10;
        }
        System.out.println("The reverse number is: " + revNum);
    }
}
