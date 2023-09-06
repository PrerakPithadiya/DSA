import java.util.Scanner;
public class Prime_Numbers_upto_N{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Start Range : ");
		int startRange = sc.nextInt();
		System.out.print("Enter the End Range : ");
		int endRange = sc.nextInt();
		System.out.println("\nPrime Numbers from '" + startRange + "' to '" + endRange + "' are :");
		printPrimes(startRange, endRange);
	}
	public static void printPrimes(int start, int end){
		System.out.print("[ ");
		for(int i = start; i <= end; i++){
			if(checkPrime(i)){
				System.out.print(i + " ");
			}
		} System.out.println("]");
	}
	public static boolean checkPrime(int n){
		if(n == 1){
			return false;
		} if(n == 2 || n == 3){
			return true;
		} if(n % 2 == 0 || n % 3 == 0){
			return false;
		} for(int i = 5; i * i <= n; i = i + 6){
			if(n % i == 0 || n % (i + 2) == 0){
				return false;
			}
		} return true;
	}
}