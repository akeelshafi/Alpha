package JavaBasics;

public class Product {

    public static int multiply(int a, int b){

        int prod = a*b;
        return prod;
    }
    public static void main(String[] args){
        int product = multiply(10,20);
        System.out.println("A * B = "+ product);


    }
}
