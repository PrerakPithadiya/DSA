import java.util.Scanner;
public class Print_Digits_of_a_Number{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		long n = sc.nextLong();
		System.out.println("\nThe Digits of a Number are : ");
		findDigits(n);
	}
	public static void findDigits(long n){
		String str = Long.toString(n);
		int len = str.length();
		System.out.print("[");
		for(int i = 0; i < len; i++){
			System.out.print(str.charAt(i));
			if(i < len - 1){ System.out.print(", "); }
		} System.out.println("]");
	}
}