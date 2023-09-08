import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Sort_Array_in_Descending{
    public static void generateArray(int arr[]){
        Random rd = new Random();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt(0, 100);
        }
    }
    public static void descendingOrderSort(int arr[]){
        Arrays.sort(arr);
        int n = arr.length, i = 0, j = n - 1, temp = 0;
        while(i < j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        generateArray(arr);

        System.out.println("Original Array -> " + Arrays.toString(arr));

        descendingOrderSort(arr);

        System.out.println("Sorted Array -> " + Arrays.toString(arr));
    }
}