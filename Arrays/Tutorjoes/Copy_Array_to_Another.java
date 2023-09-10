import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Copy_Array_to_Another{
    public static void generateArray(int arr[]){
        Random rd = new Random();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt(0, 100);
        }
    }
    public static void copyElements(int arr[], int brr[]){
        int n = brr.length;
        for(int i = 0; i < n; i++){
            brr[i] = arr[i];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        generateArray(arr);
        System.out.println("Original Array -> " + Arrays.toString(arr));
        int brr[] = new int[size];
        copyElements(arr, brr);
        System.out.println("Copied Array -> " + Arrays.toString(brr));
    }
}