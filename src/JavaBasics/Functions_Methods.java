package JavaBasics;

public class Functions_Methods {

    public static void printHelloWorld(){
        System.out.println("Hello world");
    }

    public static int calculateSum(int a, int b){

        int sum = a +b;
        return sum;
    }

    public static void main(String[] args){
      printHelloWorld();
      int sum =calculateSum(5,255);
        System.out.println(sum);
    }
}
