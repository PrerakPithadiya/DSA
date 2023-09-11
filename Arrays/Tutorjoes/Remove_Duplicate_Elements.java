import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Remove_Duplicate_Elements{
    public static void generateArray(int arr[]){
        Random rd = new Random();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt(0, 10);
        }
        Arrays.sort(arr);
    }
    public static int removeDuplicates(int arr[]){
        int n = arr.length, j = 0;
        for(int i = 0; i <= n - 2; i++){
            if(arr[i] != arr[i + 1]){
                arr[j++] = arr[i];
            }
        }
        arr[j] = arr[n - 1];
        return j;
    }
    public static void printArray(int arr[], int n){
        System.out.print("[");
        for(int i = 0; i <= n; i++){
            System.out.print(arr[i]);
            if(i < n){ System.out.print(", "); }
        }
        System.out.println("]");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        generateArray(arr);
        System.out.println("Array -> " + Arrays.toString(arr));
        int endPoint = removeDuplicates(arr);
        System.out.print("Updated Array -> ");
        printArray(arr, endPoint);
    }
}