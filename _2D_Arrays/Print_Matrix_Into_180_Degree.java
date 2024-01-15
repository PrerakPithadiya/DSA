package _2D_Arrays;

public class Print_Matrix_Into_180_Degree {
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
        System.out.println("The First Matrix is : ");
        printInto180Degree(a);
        System.out.println("\nThe Second Matrix is : ");
        printInto180Degree(b);
    }

    public static void printInto180Degree(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}