import java.util.Scanner;
public class Fibonacci_Sequence{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of terms : ");
		int n = sc.nextInt();
		System.out.println("\nThe Fibonacci Sequence upto '" + n + "' terms is : ");
		fibonacciSequence(n);
	}
	public static void fibonacciSequence(int n){
		if(n == 0){
			System.out.println("[]");
			return;
		} if(n == 1){
			System.out.println("[0]");
			return;
		} if(n == 2){
			System.out.println("[0, 1]");
			return;
		}
		int a = 0, b = 1, c = -1;
		System.out.print("[0, 1, ");
		for(int i = 3; i <= n; i++){
			c = a + b;
			System.out.print(c);
			if(i < n){ System.out.print(", "); }
			a = b;
			b = c;
		} System.out.println("]");
	}
}