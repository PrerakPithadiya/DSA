package Arrays.CollegeWallah;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class q_Number_Of_Queries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        generateArray(arr);
        System.out.println("Array is : " + Arrays.toString(arr));
        int freq[] = createFrequencyArray(arr);
        System.out.print("Enter the Number of Queries : ");
        int q = sc.nextInt();
        System.out.print("\n");
        calculateTheQueries(freq, q);
    }

    public static void calculateTheQueries(int freq[], int q) {
        Scanner sc = new Scanner(System.in);
        while (q != 0) {
            System.out.print("Enter the Number to be Search : ");
            int target = sc.nextInt();
            String ans = (freq[target] > 0) ? "YES" : "NO";
            System.out.println("Result is : " + ans);
            q--;
        }
    }

    public static int[] createFrequencyArray(int arr[]) {
        int n = arr.length;
        int freq[] = new int[100];
        for (int i = 0; i < n; i++) {
            freq[arr[i]] = freq[arr[i]] + 1;
        }
        return freq;
    }

    public static void generateArray(int arr[]) {
        Random rd = new Random();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(1, 100);
        }
    }
}