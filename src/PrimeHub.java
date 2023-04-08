package src;
import java.util.Scanner;
public class PrimeHub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean i = isPrime(num);
        if (i == true){
            System.out.println("prime");
        }
        else{
            System.out.println("composite");
        }

    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}