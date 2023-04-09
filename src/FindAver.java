package src;
import java.util.Scanner;

public class FindAver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++ ){
            arr[i] = sc.nextInt();
        }
        int minVal = findaver(arr);
        System.out.println(minVal);
    }
    private static int findaver(int[] arr) {
        int s = 0;
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        return s/arr.length;

    }
}