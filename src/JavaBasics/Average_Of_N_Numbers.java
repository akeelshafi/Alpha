package JavaBasics;

import java.util.Scanner;

public class Average_Of_N_Numbers {
    public static void main(String[] args){

    /*    Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
        these 3 numbers.
        (Hint : Average of N numbers is sum of those numbers divided by N)*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value  of A: ");
        float A = sc.nextInt();

        System.out.print("Enter the value of B: ");
        float B = sc.nextInt();

        System.out.print("Enter the value of C: ");
        float C = sc.nextInt();

        float average = (A+B+C)/3;
        System.out.println("The Average of A B and C is: "+average);


    }
}
