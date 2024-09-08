package JavaBasics;

import java.util.Scanner;

public class Conditional_Questions {
    public static void main(String[] args) {
        /*Question 1 : Write a Java program to get a number from the user and print whether it is
        positive or negative*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num >= 1) {
            System.out.println(num + " is positive");
        } else {
            System.out.println(num + " is negative");
        }
    }
}
