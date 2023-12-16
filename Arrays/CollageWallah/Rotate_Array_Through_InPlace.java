package Arrays.CollegeWallah;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Rotate_Array_Through_InPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        generateArray(arr);
        System.out.println("Array is : " + Arrays.toString(arr));
        System.out.print("Enter the Value of 'k' : ");
        int k = sc.nextInt();
        rotateArrayInPlace(arr, k);
        System.out.println("Rotated Array is : " + Arrays.toString(arr));
    }

    public static void rotateArrayInPlace(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        rotateArrayPart(arr, 0, n - k - 1);
        rotateArrayPart(arr, n - k, n - 1);
        rotateArrayPart(arr, 0, n - 1);
    }

    public static void rotateArrayPart(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void generateArray(int arr[]) {
        Random rd = new Random();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(1, 100);
        }
    }
}