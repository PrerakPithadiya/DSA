import java.util.Random;
public class GCD_of_Two_Numbers{
	public static void main(String[] args){
		Random rd = new Random();

		long num1 = rd.nextLong(0, 1_00_000);
		long num2 = rd.nextLong(0, 1_00_000);
		System.out.println("The First Number is : " + num1);
		System.out.println("The Second Number is : " + num2);

		long result = findGCD(num1, num2);
		System.out.println("\nThe GCD of '" + num1 + "' & '" + num2 + "' is : " + result);
	}
	public static long findGCD(long a, long b){
		while(a != 0 && b != 0){
			if(a > b){
				a = a % b;
			} else{
				b = b % a;
			}
		}
		if(a != 0){ return a; }
		else{ return b; }
	}
}