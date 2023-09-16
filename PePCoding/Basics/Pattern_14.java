/*

2 * 1 = 2
2 * 2 = 4
.
.
.
2 * 9 = 18
2 * 10 = 20

*/
import java.util.Scanner;
public class Pattern_14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}