package JavaBasics;

public class Factorial_Of_N {
    public static int factorial(int n){

        int f =1;

        for (int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }

    public static void main(String[] args){
        System.out.println("Factorial of n is: " +factorial(4));
    }
}
