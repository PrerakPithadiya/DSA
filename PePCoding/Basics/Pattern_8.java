/*
          *
        *
      *
    *
  *
*/

import java.util.Scanner;
public class Pattern_8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter the Number of Rows : ");
        int rows = sc.nextInt();
        printPattern(rows);
    }
    public static void printPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j == n + 1 - i){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
