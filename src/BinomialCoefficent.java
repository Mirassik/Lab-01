package src;

import java.util.Scanner;

public class BinomialCoefficent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int res = BinomCoef(i, j);
        System.out.println(res);
    }
    public static int BinomCoef(int n, int k){
        int x = n - k;
        return factorial(n)/(factorial(x)*factorial(k));
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
