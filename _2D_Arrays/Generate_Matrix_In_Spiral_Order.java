package _2D_Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Generate_Matrix_In_Spiral_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the Number of Cols : ");
        int cols = sc.nextInt();
        int[][] mat = spiralOrderMatrix(rows, cols);
        System.out.println("\nThe Matrix is : ");
        printTheMatrix(mat);
    }

    public static int[][] spiralOrderMatrix(int r, int c) {
        int top = 0, bottom = r - 1, left = 0, right = c - 1, val = 1;
        int[][] mat = new int[r][c];
        while (top <= bottom && left <= right) {
            // top
            for (int j = left; j <= right; j++) {
                mat[top][j] = val++;
            }

            // right
            for (int i = top + 1; i <= bottom; i++) {
                mat[i][right] = val++;
            }

            // bottom
            for (int j = right - 1; j >= left; j--) {
                if (top == bottom) {
                    break;
                }
                mat[bottom][j] = val++;
            }

            // left
            for (int i = bottom - 1; i >= top + 1; i--) {
                if (left == right) {
                    break;
                }
                mat[i][left] = val++;
            }

            top++;
            bottom--;
            left++;
            right--;
        }
        return mat;
    }

    public static void printTheMatrix(int[][] mat) {
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }
    }
}