package _2D_Arrays;

import java.util.Scanner;

public class Search_In_Sorted_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        int rows = mat.length, cols = mat[0].length;
        System.out.print("Which Element Do You need to Search? : ");
        int key = sc.nextInt();
        int[] location = searchTargetElement1(mat, rows, cols, key);
        System.out.println("\nThe Element is Found at Location : (" + location[0] + ", " + location[1] + ")");

        location = searchTargetElement2(mat, rows, cols, key);
        System.out.println("The Element is Found at Location : (" + location[0] + ", " + location[1] + ")");
    }

    public static int[] searchTargetElement1(int[][] mat, int r, int c, int target) {
        int i = 0, j = c - 1;
        while (i < r && j > -1) {
            if (mat[i][j] == target) {
                return new int[]{i + 1, j + 1};
            } else if (mat[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] searchTargetElement2(int[][] mat, int r, int c, int target) {
        int i = r - 1, j = 0;
        while (i > -1 && j < c) {
            if (mat[i][j] == target) {
                return new int[]{i + 1, j + 1};
            } else if (mat[i][j] < target) {
                j++;
            } else {
                i--;
            }
        }
        return new int[]{-1, -1};
    }
}