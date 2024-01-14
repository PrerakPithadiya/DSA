package _2D_Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Wave_Form_Col_Wise {
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
        int[] result = waveFormColWise(mat, rows, cols);
        System.out.println("\nThe Wave Form of Matrix is : ");
        System.out.println(Arrays.toString(result));
    }

    public static int[] waveFormColWise(int[][] mat, int m, int n) {
        int[] arr = new int[m * n];
        int k = 0;
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < m; i++) {
                    arr[k++] = mat[i][j];
                }
            } else {
                for (int i = m - 1; i >= 0; i--) {
                    arr[k++] = mat[i][j];
                }
            }
        }
        return arr;
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