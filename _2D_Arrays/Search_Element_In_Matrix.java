package _2D_Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Search_Element_In_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the Number of Cols : ");
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];
        generateMatrix(mat);
        System.out.println("\nThe Matrix is : ");
        printTheMatrix(mat);
        System.out.print("\nEnter the Element to Search : ");
        int x = sc.nextInt();
        int[] location = searchElementInMatrix(mat, x);
        if (location[0] == -1) {
            System.out.println("\nThe given Element '" + x + "' isn't Found in Matrix!");
            return;
        }
        System.out.println("\nThe Location of given Element '" + x + "' is : (" + location[0] + ", " + location[1] + ")");
    }

    public static int[] searchElementInMatrix(int[][] mat, int target) {
        int m = mat.length, n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
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
                mat[i][j] = rd.nextInt(10, 100);
            }
        }
    }
}