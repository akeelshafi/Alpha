package JavaBasics;

public class Is_Even {
    public static int isEven(int a){

        if (a % 2 == 0) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        return  a;
    }
    public static void main(String[] args){
      /*  Question 2 : Write a method named isEven that accepts an int argument. The method
        should return true if the argument is even, or false otherwise. Also write a program to test your
        method.*/

        int isEven = isEven(10);
        System.out.println("today i do nothing ");
        System.out.println("this is the another thing where  i  do nothing");

    }
}
