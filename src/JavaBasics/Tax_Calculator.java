package JavaBasics;

import java.util.Scanner;

public class Tax_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");

        int tax;
        int income = sc.nextInt();

        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Your Tax is: " + tax);


    }
}
