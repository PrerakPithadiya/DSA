package _2D_Arrays;

import java.util.Arrays;

public class Rotate_180_Degree_InAnother {
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

        int[][] res1 = rotateTo180Degree(a);
        System.out.println("The First Matrix is : ");
        printTheMatrix(res1);
        res1 = rotateTo180Degree(b);
        System.out.println("\nThe Second Matrix is : ");
        printTheMatrix(res1);
    }

    public static int[][] rotateTo180Degree(int[][] a) {
        int m = a.length, n = a[0].length;
        int[][] b = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[m - 1 - i][n - 1 - j] = a[i][j];
            }
        }
        return b;
    }

    public static void printTheMatrix(int[][] mat) {
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }
    }
}