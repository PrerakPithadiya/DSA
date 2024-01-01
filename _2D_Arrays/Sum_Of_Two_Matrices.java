package _2D_Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Sum_Of_Two_Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("For First Matrix...");
        System.out.print("Enter the Number of Rows : ");
        int rows1 = sc.nextInt();
        System.out.print("Enter the Number of Cols : ");
        int cols1 = sc.nextInt();
        int[][] mat1 = new int[rows1][cols1];
        generateRandomMatrix(mat1, rows1, cols1);
        System.out.println("\nFirst Matrix is : ");
        printTheMatrix(mat1);


        System.out.println("\nFor Second Matrix...");
        System.out.print("Enter the Number of Rows : ");
        int rows2 = sc.nextInt();
        System.out.print("Enter the Number of Cols : ");
        int cols2 = sc.nextInt();
        int[][] mat2 = new int[rows2][cols2];
        generateRandomMatrix(mat2, rows2, cols2);
        System.out.println("\nSecond Matrix is : ");
        printTheMatrix(mat2);


        int[][] sum = sumOfMatrices(mat1, rows1, cols1, mat2, rows2, cols2);
        printTheMatrix(sum);
    }

    public static int[][] sumOfMatrices(int[][] mat1, int m1, int n1, int[][] mat2, int m2, int n2) {
        if (m1 != m2 || n1 != n2) {
            System.out.println("\nThe Both Matrices are Different - Can't Calculate Sum of it!");
            return new int[][]{};
        }
        int[][] sum = new int[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("\nThe Sum of Both Matrices is : ");
        return sum;
    }

    public static void generateRandomMatrix(int[][] mat, int m, int n) {
        Random rd = new Random();
        for (int i = 0; i < m; i++) {
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