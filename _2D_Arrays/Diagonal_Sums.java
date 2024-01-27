package _2D_Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Diagonal_Sums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows & Cols : ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        generateRandomMatrix(mat, n);
        System.out.println("\nThe Matrix is : ");
        printTheMatrix(mat);
        int[] result = diagonalSum(mat, n);
        System.out.println("\nPrimary Diagonal Sum : " + result[0]);
        System.out.println("Secondary Diagonal Sum : " + result[1]);
    }

    public static int[] diagonalSum(int[][] mat, int n) {
        int priDia = 0, secDia = 0, j = n - 1, i = 0;
        while (i < n) {
            priDia += mat[i][i];
            if (i != j) {
                secDia += mat[i][j];
            }
            i++;
            j--;
        }
        return new int[]{priDia, secDia};
    }

    public static void generateRandomMatrix(int[][] mat, int n) {
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = rd.nextInt(0, 10);
            }
        }
    }

    public static void printTheMatrix(int[][] mat) {
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }
    }
}