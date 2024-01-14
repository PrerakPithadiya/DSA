package _2D_Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Find_Row_Having_Max_Ones {
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
        int[] result = findRowHavingMaxOnes(mat, rows);
        System.out.println("\nThe Maximum Number of 1's is : " + result[0]);
        System.out.println("The Row Number is : " + result[1]);
    }

    public static int[] findRowHavingMaxOnes(int[][] mat, int m) {
        int max = Integer.MIN_VALUE, row = -1;
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int element : mat[i]) {
                if (element == 1) {
                    count++;
                }
            }
            if (max < count) {
                max = count;
                row = i + 1;
            }
        }
        return new int[]{max, row};
    }

    public static void generateRandomMatrix(int[][] mat, int m, int n) {
        Random rd = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = rd.nextInt(2);
            }
        }
    }

    public static void printTheMatrix(int[][] mat) {
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }
    }
}