package JavaBasics;

public class Function_Overloading_Using_No_Of_Parameters {
    // function to calculate sum of 2 numbers

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b,int c){
        return a+b+c;
    }
    public static void main(String[] args){
        System.out.println(sum(10,20));
        System.out.println(sum(5,10,15));
    }
}
