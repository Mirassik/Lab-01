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
    /*
    @ if - condition
    @ length() - the length of the string
    @ isDigit - method that determine digit
    @ return - return boolean expression
    */
    public static boolean isAllDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
