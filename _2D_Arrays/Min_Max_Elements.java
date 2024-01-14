package _2D_Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Min_Max_Elements {
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
        int[][] maxMinIndex = findMaxMinElements(mat, rows, cols);
        System.out.printf("\nMaximum Element : %d, ", maxMinIndex[0][0]);
        System.out.printf("Location : (%d, %d)\n", maxMinIndex[0][1], maxMinIndex[0][2]);
        System.out.printf("Minimum Element : %d, ", maxMinIndex[1][0]);
        System.out.printf("Location : (%d, %d)\n", maxMinIndex[1][1], maxMinIndex[1][2]);
    }

    public static int[][] findMaxMinElements(int[][] mat, int m, int n) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int[][] result = new int[2][3];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < mat[i][j]) {
                    max = mat[i][j];
                    result[0][1] = i;
                    result[0][2] = j;
                }
                if (min > mat[i][j]) {
                    min = mat[i][j];
                    result[1][1] = i;
                    result[1][2] = j;
                }
            }
        }
        result[0][0] = max;
        result[1][0] = min;
        return result;
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