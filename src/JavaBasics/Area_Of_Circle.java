package JavaBasics;

import java.util.Scanner;

public class Area_Of_Circle {
    public static void main(String[] args){
        // calculating area of circle

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of radius: ");
        float radius = sc.nextFloat();

        float pi = 3.14f;

        float area = pi*radius*radius;
        System.out.println(area);


    }
}
