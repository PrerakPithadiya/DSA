package _2D_Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Print_The_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the Number of Cols : ");
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];
        generateMatrix(mat);
        System.out.println("The Matrix is : ");
        printTheMatrix(mat);
    }

    public static void printTheMatrix(int[][] mat) {
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void generateMatrix(int[][] mat) {
        Random rd = new Random();
        int m = mat.length, n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = rd.nextInt(0, 100);
            }
        }
    }
}