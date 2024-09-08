package JavaBasics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        int a = sc.nextInt();

        System.out.println("Enter operator(eg: +, -, *, /, %)");
        int operator = sc.next().charAt(0);

        System.out.print("Enter the value of B: ");
        int b = sc.nextInt();

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;

            case '%':
                System.out.println(a % b);
                break;

            default:
                System.out.println("not Able to Solve this problem!");
        }


    }
}
