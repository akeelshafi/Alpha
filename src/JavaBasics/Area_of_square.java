package JavaBasics;

import java.util.Scanner;

public class Area_of_square {
    public static void main(String[] args){
       /* Question 2: In a program, input the side of a square. You have to output the area of the
        square.
        (Hint : area of a square is (side x side))*/

        Scanner sc = new Scanner(System.in);
        System.out.print("The the value of Side of the Square: ");
        int side = sc.nextInt();

        int area = side*side;
        System.out.println("The area of square is: "+area);
    }
}
