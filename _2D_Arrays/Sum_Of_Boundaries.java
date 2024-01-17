package _2D_Arrays;

public class Sum_Of_Boundaries {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 6, 3, 8, 2, 4},
                {8, 5, 2, 5, 4, 1},
                {0, 5, 9, 2, 6, 3},
                {1, 7, 6, 2, 5, 3}
        };
        int l1 = 2, r1 = 3, l2 = 3, r2 = 4;

        // method - 1
        int sum1 = calculateSum1(mat, l1, r1, l2, r2);

        // method - 2
        int sum2 = calculateSum2(mat, l1, r1, l2, r2);

        // method - 3
        int sum3 = calculateSum3(mat, l1, r1, l2, r2);

        System.out.println("Sum 1 is : " + sum1);
        System.out.println("Sum 2 is : " + sum2);
        System.out.println("Sum 3 is : " + sum3);
    }


    // method - 1
    public static int calculateSum1(int[][] mat, int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += mat[i][j];
            }
        }
        return sum;
    }


    // method - 2
    public static int calculateSum2(int[][] mat, int l1, int r1, int l2, int r2) {
        int r = mat.length, c = mat[0].length, sum = 0;
        // row wise prefix
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                mat[i][j] += mat[i][j - 1];
            }
        }
        for (int i = l1; i <= l2; i++) {
            if (r1 > 0) {
                sum += (mat[i][r2] - mat[i][r1 - 1]);
            } else {
                sum += mat[i][r2];
            }
        }
        return sum;
    }


    // method - 3
    public static int calculateSum3(int[][] mat, int l1, int r1, int l2, int r2) {
        int r = mat.length, c = mat[0].length;
        // row wise prefix
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                mat[i][j] += mat[i][j - 1];
            }
        }

        // col wise prefix
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                mat[i][j] += mat[i - 1][j];
            }
        }


        if (l1 == 0 && r1 == 0) {
            return mat[l2][r2];
        }
        if (l1 == 0 && r1 != 0) {
            return mat[l2][r2] - mat[l2][r1 - 1];
        }
        if (l1 != 0 && r1 == 0) {
            return mat[l2][r2] - mat[l1 - 1][r2];
        }
        return mat[l2][r2] - mat[l2][r1 - 1] + mat[l1 - 1][r1 - 1] - mat[l1 - 1][r2];
    }
}