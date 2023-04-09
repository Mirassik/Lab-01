package src;
import java.util.Scanner;

public class Reversearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(num, arr);
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int n, int[] arr) {
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
