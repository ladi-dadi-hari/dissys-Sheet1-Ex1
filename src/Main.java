/* Write a program that contains a function which calculates the Dings.Factorial of a non-negative integral
number. Call this function from your main-function.  */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter a non negative integer. The factorial is gonna get calculated.");

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        while (i < 0) {

            System.out.println("Please enter a non Negative Integer.");
            i = scan.nextInt();

        }

        System.out.println(Factorial.factorial(i));


    }

}