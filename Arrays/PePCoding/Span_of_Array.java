import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Span_of_Array{
    public static void generateArray(int arr[]){
        Random rd = new Random();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt(0, 100);
        }
    }
    public static int calculateSpan(int arr[]){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int element : arr){
            max = Math.max(max, element);
            min = Math.min(min, element);
        }
        return max - min;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size -> ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        generateArray(arr);
        System.out.println("Array -> " + Arrays.toString(arr));
        int span = calculateSpan(arr);
        System.out.println("Span of Array -> " + span);
    }
}