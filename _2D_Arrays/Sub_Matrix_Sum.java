package _2D_Arrays;

public class Sub_Matrix_Sum {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {5, 4, 3, 2, 1}
        };
        int l1 = 0, r1 = 1, l2 = 2, r2 = 3, sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += mat[i][j];
            }
        }
        System.out.println("The Sub Matrix Sum is : " + sum);
    }
}
