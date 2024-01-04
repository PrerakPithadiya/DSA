package _2D_Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Rotate_The_Matrix_90_To_Clockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the Number of Cols : ");
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];
        generateRandomMatrix(mat, rows, cols);
        System.out.println("\nThe Original Matrix is : ");
        printTheMatrix(mat);

        int[][] rotate = rotateTheMatrixTo90Degree(mat, rows, cols);

        System.out.println("\nThe Rotated Matrix is : ");
        printTheMatrix(rotate);
    }

    public static int[][] rotateTheMatrixTo90Degree(int[][] a, int m, int n) {
        int[][] b = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[j][m - 1 - i] = a[i][j];
            }
        }
        return b;
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