import java.util.Scanner;
public class isPrime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		String result;
		if(checkIsPrime(n)){
			result = "is";
		} else{
			result = "isn't";
		}
		System.out.println("The given Number '" + n + "' " + result + " Prime!");
	}
	public static boolean checkIsPrime(int n){
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