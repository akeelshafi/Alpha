package JavaBasics;

import java.util.Scanner;

public class Sum_Of_First_Natural_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum is: " + sum);
    }
}
