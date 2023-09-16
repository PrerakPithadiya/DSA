import java.util.Random;
import java.util.Scanner;
public class Digit_Frequency{
    public static void main(String[] args){
        Random rd = new Random();
        int n = rd.nextInt(10_000, 1_00_00_000);
        System.out.println("Number is : " + n);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Digit : ");
        int digit = sc.nextInt();
        int freq = countFrequency(n, digit);
        int freq2 = anotherMethod(n, digit);
        System.out.println("Frequency of '" + digit + "' is : " + freq);
        System.out.println("Frequency of '" + digit + "' is : " + freq2);
    }
    public static int countFrequency(int n, int digit){
        String str = Integer.toString(n);
        char ch = (char)(digit + 48);
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
    public static int anotherMethod(int n, int digit){
        int r = 0, count = 0;
        while(n != 0){
            r = n % 10;
            if(r == digit){ count++; }
            n /= 10;
        }
        return count;
    }
}