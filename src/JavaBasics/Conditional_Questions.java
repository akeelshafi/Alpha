package JavaBasics;

import java.util.Scanner;

public class Conditional_Questions {
    public static void main(String[] args) {
        /*Question 1 : Write a Java program to get a number from the user and print whether it is
        positive or negative*/
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num >= 1) {
            System.out.println(num + " is positive");
        } else {
            System.out.println(num + " is negative");
        }*/

        /*Question 2 : Finish the following code so that it prints You have a fever if your temperature
        is above 100 and otherwise prints You don't have a fever.*/

       /* double temp = 103.5;
        if (temp>100){
            System.out.println("you have a fever");
        }else {
            System.out.println("You don't have fever");
        }*/

      /*  int a = 63, b = 36;
        boolean x = (a < b ) ? true : false;
        int y= (a > b ) ? a : b;*/

        /*Question 5 : Write a Java program that takes a year from the user and print whether that
        year is a leap year or not.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is Leap year");

        } else {
            System.out.println(year + " is not Leap year");
        }


    }
}

