package JavaBasics;

public class Largest_Of_Three {
    public static void main(String[] args){

        int A =5, B=10, C=15;

        if ((A >= B) && (A >= C)) {

            System.out.println("A is largest of 3");
        } else if (B>=C) {
            System.out.println("B is largest of 3");

        }else {
            System.out.println("C is largest  of 3");
        }
    }
}
