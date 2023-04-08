package src;
import java.util.Scanner;

public class Power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        int y = sc.nextInt();
        double result = power(x,y);
        System.out.println(result);
    }
    public static double power(double a, int n){
        return Math.pow(a, n);
    }
}
