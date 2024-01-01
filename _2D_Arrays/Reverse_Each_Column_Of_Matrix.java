package _2D_Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Reverse_Each_Column_Of_Matrix {
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

        reverseEachColumnOfMatrix(mat, rows, cols);

        System.out.println("\nThe Reversed Matrix is : ");
        printTheMatrix(mat);
    }

    public static void reverseEachColumnOfMatrix(int[][] mat, int m, int n) {
        for (int col = 0; col < n; col++) {
            int i = 0, j = m - 1;
            while (i < j) {
                int temp = mat[i][col];
                mat[i][col] = mat[j][col];
                mat[j][col] = temp;
                i++;
                j--;
            }
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