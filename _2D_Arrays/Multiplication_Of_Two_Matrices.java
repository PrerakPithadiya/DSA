package _2D_Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Multiplication_Of_Two_Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("For First Matrix...");
        System.out.print("Enter the Number of Rows : ");
        int r1 = sc.nextInt();
        System.out.print("Enter the Number of Cols : ");
        int c1 = sc.nextInt();
        int[][] mat1 = new int[r1][c1];
        generateRandomMatrix(mat1);
        System.out.println("\nThe First Matrix is : ");
        printTheMatrix(mat1);


        System.out.println("\nFor Second Matrix...");
        System.out.print("Enter the Number of Rows : ");
        int r2 = sc.nextInt();
        System.out.print("Enter the Number of Cols : ");
        int c2 = sc.nextInt();
        int[][] mat2 = new int[r2][c2];
        generateRandomMatrix(mat2);
        System.out.println("\nThe Second Matrix is : ");
        printTheMatrix(mat2);

        int[][] mul = multiplicationOfTwoMatrices(mat1, r1, c1, mat2, r2, c2);
        printTheMatrix(mul);
    }

    public static int[][] multiplicationOfTwoMatrices(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("\nCan't Find Multiplication of these Two Matrices!");
            return new int[][]{};
        }
        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("\nThe Multiplication of Both Matrices is : ");
        return mul;
    }

    public static void printTheMatrix(int[][] mat) {
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void generateRandomMatrix(int[][] mat) {
        Random rd = new Random();
        int m = mat.length, n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = rd.nextInt(0, 10);
            }
        }
    }
}