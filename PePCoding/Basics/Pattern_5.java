/*

      * 
    * * * 
  * * * * * 
* * * * * * * 
  * * * * * 
    * * * 
      * 

*/

import java.util.Scanner;
public class Pattern_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Odd Number of Rows : ");
        int rows = sc.nextInt();
        printPattern(rows);
    }
    public static void printPattern(int n){
        int nsp = n / 2, nst = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= nsp; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= nst; j++){
                System.out.print("* ");
            }
            if(i < n / 2 + 1){
                nsp -= 1;
                nst += 2;
            } else{
                nsp += 1;
                nst -= 2;
            }
            System.out.println();
        }
    }
}
