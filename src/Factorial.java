package src;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i < 0) {
            System.out.println("Error: Factorial was defining only for non-negative numbers");
        } else {
            int x = factorial(i);
            System.out.println(x);
        }
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
