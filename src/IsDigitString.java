package src;
import java.util.Scanner;

public class IsDigitString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        if(!isAllDigits(x)){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
    public static boolean isAllDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
