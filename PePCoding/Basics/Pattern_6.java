import java.util.Scanner;
public class Pattern_6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Odd Number of Rows : ");
        int rows = sc.nextInt();
        printPattern(rows);
    }
    public static void printPattern(int n){
        int nsp = 1, nst = n / 2 + 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= nst; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= nsp; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= nst; j++){
                System.out.print("* ");
            }
            if(i < n / 2 + 1){
                nst -= 1;
                nsp += 2;
            } else{
                nst += 1;
                nsp -= 2;
            }
            System.out.println();
        }
    }
}