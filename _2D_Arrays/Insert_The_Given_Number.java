package _2D_Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Insert_The_Given_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the Number of Cols : ");
        int cols = sc.nextInt();
        System.out.print("\nWhich Number Do You need to Store? : ");
        int num = sc.nextInt();
        int[][] mat = new int[rows][cols];
        insertTheNumberToMatrix(mat, rows, cols, num);
        System.out.println("\nThe Matrix is : ");
        printTheMatrix(mat);
    }

    public static void insertTheNumberToMatrix(int[][] mat, int m, int n, int val) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = val;
            }
        }
    }

    public static void printTheMatrix(int[][] mat) {
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }
    }
}