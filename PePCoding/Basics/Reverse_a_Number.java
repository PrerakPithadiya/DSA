import java.util.Scanner;
public class Reverse_a_Number{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		long n = sc.nextLong();
		long reverseNum = numberReversion(n);
		System.out.println("\nThe Origianl Number is : " + n);
		System.out.println("The Reversed Number is : " + reverseNum);
	}
	public static long numberReversion(long n){
		byte r = 0;
		long rev = 0;
		while(n != 0){
			r = (byte)(n % 10);
			rev = rev * 10 + r;
			n /= 10;
		}
		return rev;
	}
}