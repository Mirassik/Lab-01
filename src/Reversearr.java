package src;
import java.util.Scanner;

public class Reversearr {
    /*
    @ Scanner - syntax to scan the answer of user
    @ num - the number of elements in array
    @ arr[] - the array
    */
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
    /*
    @ left - start point of the array
    @ right - ending point of the array
    @ temp - new array that will return
    @ while - loop that used to do method
    */

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
