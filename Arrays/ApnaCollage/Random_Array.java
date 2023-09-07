import java.util.Scanner;
import java.util.Random;
public class Random_Array{
    public static void generateArray(int arr[]){
        Random rd = new Random();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt(0, 100);
        }
    }
    public static void printArray(int arr[]){
        int n = arr.length;
        System.out.print("[");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
            if(i < n - 1){ System.out.print(", "); }
        }
        System.out.println("]");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Length : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        generateArray(arr);

        System.out.print("Array -> ");
        printArray(arr);
    }
}