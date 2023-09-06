import java.util.Scanner;
public class is_Pythagorean_Triplets{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Side : ");
		int a = sc.nextInt();
		System.out.print("Enter Second Side : ");
		int b = sc.nextInt();
		System.out.print("Enter Third Side : ");
		int c = sc.nextInt();

		String result;
		if(isTriplets(a, b, c)){
			result = "is";
		} else{
			result = "isn't";
		}
		System.out.println("\nThe given Triangle " + result + " a Right Angle!");
	}
	public static boolean isTriplets(int a, int b, int c){
		boolean con1, con2, con3;
		con1 = ((a * a) + (b * b)) == (c * c);
		con2 = ((b * b) + (c * c)) == (a * a);
		con3 = ((a * a) + (c * c)) == (b * b) ;
		if(con1 || con2 || con3){
			return true;
		} else{
			return false;
		}
	}
}