package JavaBasics;

import java.util.Scanner;

public class Methods_Questions {

    public static  double average(double a, double b, double c){
        return (a+b+c) /3;
    }
    public static void main(String [] args){
        //Question 1 : Write a Java method to compute the average of three numbers

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of first number: ");
        double a = sc.nextDouble();

        System.out.println("Enter  the value of second number: ");
        double b = sc.nextInt();

        System.out.println("Enter the value of third number: ");
        double c = sc.nextDouble();

        System.out.println("the average value is: "+ average(10,20,30));


    }
}
