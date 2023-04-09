package src;
import java.util.Scanner;

public class GCD {
    /*
        @ Scanner - syntax to scan the answer of user
        @ x - first number of user
        @ y - second number of user
        @ result - variable special to get value of gcd
    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = gcd(x, y);
        System.out.println(result);
    }
    /*
        @ gcd - determining the greatest common divisor between 2 numbers
        @ a - the first number
        @ b - the second number
        @ first return - returning the a, when b equal to zero(0)
        @ second return - returning the gcd by given formula
    */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Base case: GCD(a, 0) = a
        }
        return gcd(b, a % b); // Recursive case: GCD(a, b) = GCD(b, a mod b)
    }
}
