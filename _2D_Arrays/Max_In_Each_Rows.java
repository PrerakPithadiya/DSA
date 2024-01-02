package _2D_Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Max_In_Each_Rows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the Number of Cols : ");
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];
        generateRandomMatrix(mat, rows, cols);
        System.out.println("\nThe Matrix is : ");
        printTheMatrix(mat);

        int[] rowMax = findMaxInEachRow(mat, rows, cols);
        System.out.println("\nThe Maximum Element in each Row is :");
        System.out.println(Arrays.toString(rowMax));
    }

    public static int[] findMaxInEachRow(int[][] mat, int m, int n) {
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                max = Math.max(max, mat[i][j]);
            }
            arr[i] = max;
        }
        return arr;
    }

    public static void printTheMatrix(int[][] mat) {
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void generateRandomMatrix(int[][] mat, int m, int n) {
        Random rd = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = rd.nextInt(10, 100);
            }
        }
    }
}