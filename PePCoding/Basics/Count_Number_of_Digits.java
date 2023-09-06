import java.util.Scanner;

public class Count_Number_of_Digits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : ");
		long n = sc.nextLong();

		int result = countDigits(n);
		int result2 = anotherWay(n);

		System.out.println("\nThe Number of Digits are (Method 1) : " + result);
		System.out.println("The Number of Digits are (Method 2) : " + result2);
	}
	public static int countDigits(long n){
		int count = 0;
		while(n != 0){
			n /= 10;
			count++;
		}
		return count;
	}
	public static int anotherWay(long n){
		return Long.toString(n).length();
	}
}