package _2D_Arrays;

import java.util.Arrays;

public class Rotate_180_Degree_InPlace {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] b = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotateTo180Degree(a);
        System.out.println("The First Matrix is : ");
        printTheMatrix(a);
        rotateTo180Degree(b);
        System.out.println("\nThe Second Matrix is : ");
        printTheMatrix(b);
    }

    public static void rotateTo180Degree(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        for (int row = 0; row < m; row++) {
            int i = 0, j = n - 1;
            while (i < j) {
                int temp = mat[row][i];
                mat[row][i] = mat[row][j];
                mat[row][j] = temp;
                i++;
                j--;
            }
        }
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

    public static void printTheMatrix(int[][] mat) {
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }
    }
}