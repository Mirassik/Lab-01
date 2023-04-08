package src;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++ ){
            arr[i] = sc.nextInt();
        }
        int minVal = findMin(arr);
        System.out.println(minVal);

    }

    private static int findMin(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;
    }
}
