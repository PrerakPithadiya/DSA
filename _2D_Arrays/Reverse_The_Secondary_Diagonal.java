package _2D_Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Reverse_The_Secondary_Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows & Cols : ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        generateRandomMatrix(mat, n);
        System.out.println("\nThe Original Matrix is : ");
        printTheMatrix(mat);
        reversePrimaryDiagonal(mat, n);
        System.out.println("\nThe Updated Matrix is : ");
        printTheMatrix(mat);
    }

    public static void reversePrimaryDiagonal(int[][] mat, int n) {
        int i = 0, j = n - 1;
        while (i < j) {
            int temp = mat[i][n - 1 - i];
            mat[i][n - 1 - i] = mat[j][n - 1 - j];
            mat[j][n - 1 - j] = temp;
            i++;
            j--;
        }
    }

    public static void printTheMatrix(int[][] mat) {
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void generateRandomMatrix(int[][] mat, int n) {
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = rd.nextInt(10, 100);
            }
        }
    }
}