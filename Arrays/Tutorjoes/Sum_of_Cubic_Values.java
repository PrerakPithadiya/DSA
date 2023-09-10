import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Sum_of_Cubic_Values{
    public static void generateArray(int arr[]){
        Random rd = new Random();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt(0, 10);
        }
    }
    public static int cubicElementsSum(int arr[]){
        int sum = 0;
        for(int e : arr){
            sum = sum + (e * e * e);
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        generateArray(arr);
        System.out.println("Array -> " + Arrays.toString(arr));
        System.out.println("Sum of Cubic Elements -> " + cubicElementsSum(arr));
    }
}