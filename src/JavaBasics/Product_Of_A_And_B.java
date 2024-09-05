package JavaBasics;

import java.util.Scanner;

public class Product_Of_A_And_B {
    public static void main(String[] args){
        // product of two numbers
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  the value of A: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of B: ");
        int b = sc.nextInt();

        int product = a*b;
        System.out.println("The product  of A and B is: "+product);

    }
}
