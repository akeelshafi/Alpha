package JavaBasics;

public class Print_reverse_Number {
    public static void main(String[] args) {

        int n = 10899;

        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n /= 10;
        }
    }
}
