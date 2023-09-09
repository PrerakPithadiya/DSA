import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Display_Array_in_Reverse{
    public static void generateArray(int arr[]){
        Random rd = new Random();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt(0, 100);
        }
    }
    public static void reverseDisplay(int arr[]){
        int n = arr.length;
        System.out.print("[");
        for(int i = n - 1; i >= 0; i--){
            System.out.print(arr[i]);
            if(i > 0){ System.out.print(", "); }
        }
        System.out.println("]");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        generateArray(arr);
        System.out.println("Original Array -> " + Arrays.toString(arr));
        System.out.print("Reversed Array -> ");
        reverseDisplay(arr);
    }
}