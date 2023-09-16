/*

1 
2 3 
4 5 6 
7 8 9 10 

*/
import java.util.Scanner;
public class Pattern_11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows : ");
        int rows = sc.nextInt();
        printPattern(rows);
    }
    public static void printPattern(int n){
        int a = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }
}