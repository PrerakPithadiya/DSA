package _2D_Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Rotate_The_Matrix_AntiClockwise_InPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows & Cols : ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        generateRandomMatrix(mat, n);
        System.out.println("\n\nThe Original Matrix is : ");
        printTheMatrix(mat);
        rotateAntiClockwiseInPlace(mat, n);
        System.out.println("\n\nThe Rotated Matrix is : ");
        printTheMatrix(mat);
    }

    public static void rotateAntiClockwiseInPlace(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int col = 0; col < n; col++) {
            int i = 0, j = n - 1;
            while (i < j) {
                int temp = mat[i][col];
                mat[i][col] = mat[j][col];
                mat[j][col] = temp;
                i++;
                j--;
            }
        }
    }

    public static void printTheMatrix(int[][] mat) {
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void generateRandomMatrix(int[][] a, int n) {
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rd.nextInt(10, 100);
            }
        }
    }
}