package JavaBasics;


import java.util.Scanner;

public class Total_Cost_Of_Bill {
    public static void main(String[] args){

        /* Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
        an eraser. You have to output the total cost of the items back to the user as their bill.
        (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of Pencil: ");
        float Pencil = sc.nextFloat();

        System.out.print("Enter the price of Pen: ");
        float Pen = sc.nextFloat();

        System.out.print("Enter the price of Eraser: ");
        float Eraser = sc.nextFloat();

        float TotalAmount = Pencil+ Pen+ Eraser;
        float GstBill = TotalAmount+(TotalAmount*(18/100.f));

        System.out.println("The Total bill amount with 18% GST is: "+GstBill);


    }
}
