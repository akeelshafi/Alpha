package JavaBasics;

public class Inverted_Star {
    public static void main(String[] args) {

        int n = 4;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
