import java.util.Random;
import java.util.Scanner;
import java.lang.StringBuilder;
public class Rotate_a_Number{
	public static void main(String[] args){
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		long n = rd.nextLong(0, 1_00_00_00_000);
		System.out.println("The Number is : " + n);
		System.out.print("Enter the Number of Rotations : ");
		int k = sc.nextInt();
		long rotatedNum = rotateTheNumber(n, k);
		System.out.println("\nThe Rotated Number is : " + rotatedNum);
	}
	public static long rotateTheNumber(long n, int k){
		if(k == 0){
			return n;
		}
		StringBuilder sb = new StringBuilder(Long.toString(n));
		int len = sb.length(); 
		k = k % len;
		if(k > 0){
			return rightRotation(n, k, sb, len);
		} else{
			k *= -1;
			return leftRotation(n, k, sb, len);
		}
	}
	public static long rightRotation(long n, int k, StringBuilder sb, int len){
		for(int i = 1; i <= k; i++){
			sb.insert(0, sb.charAt(len - 1));
			sb.deleteCharAt(len);
		}
		return Long.parseLong(sb.toString());
	}
	public static long leftRotation(long n, int k, StringBuilder sb, int len){
		for(int i = 1; i <= k; i++){
			sb.append(sb.charAt(0));
			sb.deleteCharAt(0);
		}
		return Long.parseLong(sb.toString());
	}
}