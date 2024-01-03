package _2D_Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Find_HCF_And_LCM_In_Each_Rows {
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

        performGivenOperations(mat, rows, cols);

        System.out.println("\nThe Updated Matrix is : ");
        printTheMatrix(mat);
    }

    public static void performGivenOperations(int[][] mat, int m, int n) {
        for (int i = 0; i < m; i++) {
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            int maxIndex = -1, minIndex = -1;
            for (int j = 0; j < n; j++) {
                if (max < mat[i][j]) {
                    max = mat[i][j];
                    maxIndex = j;
                }
                if (min > mat[i][j]) {
                    min = mat[i][j];
                    minIndex = j;
                }
            }
            mat[i][maxIndex] = HCF(max, min);
            mat[i][minIndex] = LCM(max, min);
        }
    }

    public static int LCM(int a, int b) {
        return (a * b) / HCF(a, b);
    }

    public static int HCF(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a != 0) {
            return a;
        } else {
            return b;
        }
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