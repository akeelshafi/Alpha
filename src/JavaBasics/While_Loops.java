package JavaBasics;

import java.util.Scanner;

public class While_Loops {
    public static void main(String[] args) {

        // print numbers from 1-10
        /*int number = 1;

        while (number <= 10) {
            System.out.print(number+" ");
            number++;
        }*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Range: ");
        int range = sc.nextInt();

        int counter = 1;

        while (counter <= range) {
            System.out.print(counter +" ");
            counter++;
        }

    }
}
