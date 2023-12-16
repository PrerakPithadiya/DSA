package Arrays.CollegeWallah;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Rotate_Array_With_Using_Another_Array {
    public static void generateArray(int arr[]) {
        Random rd = new Random();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(1, 100);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        generateArray(arr);
        System.out.println("Array is : " + Arrays.toString(arr));
        System.out.print("Enter the Value of 'k' : ");
        int k = sc.nextInt();
        int ans[] = rotateArray(arr, k);
        System.out.println("Rotated Array is : " + Arrays.toString(ans));
    }

    public static int[] rotateArray(int arr[], int k) {
        int n = arr.length, m = 0;
        k = k % n;
        int ans[] = new int[n];
        for (int i = n - k; i < n; i++) {
            ans[m++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[m++] = arr[i];
        }
        return ans;
    }
}