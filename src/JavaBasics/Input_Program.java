package JavaBasics;

import java.util.Scanner;

public class Input_Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the  value  of A");
        int a = sc.nextInt();

        System.out.print("Enter  the value of B");
        int b = sc.nextInt();

        int sum =  a+b;
        System.out.println("The sum of A and B is : "+sum);



    }
}
