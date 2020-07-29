import java.util.Scanner;

public class swapWithTwoVar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first num: ");
        int first = input.nextInt();
        System.out.println("Enter second num: ");
        int second = input.nextInt();

        swap(first, second);
    }

    public static void swap(int first, int second) {
        System.out.println("Before swap: " + first + " in first and " + second + " in second.");
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println("After swap: " + first + " in first and " + second + " in second.");
    }
}
