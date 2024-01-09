package _2D_Arrays.DSA.src._2D_Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Sum_Of_Each_Rows_And_Cols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numbers of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the Number of Cols : ");
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];
        generateRandomMatrix(mat, rows, cols);
        System.out.println("\nThe Matrix is : ");
        printTheMatrix(mat);
        System.out.print("\n");
        sumOfEachRows(mat, rows, cols);
        System.out.print("\n");
        sumOfEachCols(mat, rows, cols);
    }

    public static void sumOfEachRows(int[][] mat, int m, int n) {
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum = sum + mat[i][j];
            }
            System.out.printf("Sum of Rows %d is : %d\n", i + 1, sum);
        }
    }

    public static void sumOfEachCols(int[][] mat, int m, int n) {
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < m; i++) {
                sum = sum + mat[i][j];
            }
            System.out.printf("Sum of Col %d is : %d\n", j + 1, sum);
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

    public static void printTheMatrix(int[][] mat) {
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
