import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Max_Min_Element{
    public static void generateArray(int arr[]){
        Random rd = new Random();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt(0, 100);
        }
    }
    public static void findMaxMinElement(int arr[]){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int element : arr){
            if(max < element){
                max = element;
            } if(min > element){
                min = element;
            }
        }
        System.out.println("\nMinimum Element : " + min);
        System.out.println("Maximum Element : " + max);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        generateArray(arr);
        System.out.println("Array -> " + Arrays.toString(arr));
        findMaxMinElement(arr);
    }
}