import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Sort_Array_in_Ascending{
    public static void generateArray(int arr[]){
        Random rd = new Random();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt(0, 101);
        }
    }
    public static void sortArray(int arr[]){
        Arrays.sort(arr);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        generateArray(arr);

        System.out.println("Original Array -> " + Arrays.toString(arr));

        sortArray(arr);

        System.out.println("Sorted Array -> " + Arrays.toString(arr));
    }
}