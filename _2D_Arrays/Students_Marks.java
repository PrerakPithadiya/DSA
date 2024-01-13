package _2D_Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Students_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Students : ");
        int n = sc.nextInt();
        int[][] marks = new int[n][4];
        generateStudentsMarks(marks, n, 4);
        System.out.println("\nThe Students Marks are : ");
        printStudentsMarks(marks);
    }

    public static void generateStudentsMarks(int[][] marks, int m, int n) {
        Random rd = new Random();
        for (int i = 0; i < m; i++) {
            marks[i][0] = i + 1;
            for (int j = 1; j < n; j++) {
                marks[i][j] = rd.nextInt(10, 100);
            }
        }
    }

    public static void printStudentsMarks(int[][] marks) {
        for (int[] arr : marks) {
            System.out.println(Arrays.toString(arr));
        }
    }
}