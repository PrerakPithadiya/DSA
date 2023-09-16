/*

1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1

*/

import java.util.Scanner;
public class Pattern_13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows : ");
        int rows = sc.nextInt();
        printPattern(rows);
    }
    public static void printPattern(int n){
        int val = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(j == 1 || i == 1){
                    val = 1;
                } else{
                    val = val * (i - j + 1) / (j - 1);
                }
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}