package JavaBasics;

public class Function_Overloading_Using_Data_Types {

    // calculate sum  of integer float double numbers

    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static double sum(double a, double b){
        return a+b;
    }
    public static void main(String[] args){

        System.out.println("Sum of integer value is: "+sum(10,20));
        System.out.println("Sum of floating value is: "+ sum(10.0f,20.0f));
        System.out.println("Sum of double value is: "+ sum(10,20));
        function();

    }
    public static void function(){
        System.out.println("this is an normal function");
        System.out.println("this is another function");
        System.out.println("btech cse");
        System.out.println("btech cse");

        System.out.println("not doing anything ");
        System.out.println("not doing anything again");
        System.out.println();

    }

}
