package JavaBasics;

import java.util.Scanner;

public class Input {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.nextLine();
        System.out.println(name);

    }
}
