package JavaBasics;

import java.util.Scanner;

public class Loops_Questions {
    public static void main(String[] args) {
      /*  for(int i=0; i<5; i++) {
            System.out.println("Hello");
            i+=2;
        }*/

       /* Question 2 : Write a program that reads a set of integers, and then prints the sum of the
        even and odd integers.*/
        /*Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B: ");
        int b = sc.nextInt();
        int sum = a+b;

        if (sum%2==0 ){
            System.out.println("sum of even numbers: "+ sum);
        }else {
            System.out.println("sum of odd numbers: "+ sum);
        }*/

       /* Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.print("Enter the number ");
            number = sc.nextInt();
            if( number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
                    choice = sc.nextInt();
        } while(choice==1);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);



*/
      /*  for(int i = 0; i <= 5; i++ ) {
            System.out.println("i = " + i );
        }*/

      /*  Question 4 : Write a program to print the multiplication table of a number N, entered by the
        user.*/

        /*Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(a+" X "+i+" = "+a*i);
        }

        Question 3 : Write a program to find the factorial of any number entered by the user.*/


    }
}
