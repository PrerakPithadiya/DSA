import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Merge_Two_Arrays{
    public static void generateArray(int arr[]){
        Random rd = new Random();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt(0, 100);
        }
    }
    public static void mergeArray(int arr[], int brr[], int crr[]){
        int n = arr.length, m = brr.length, k = 0;
        for(int i = 0; i < n; i++){
            crr[k++] = arr[i];
        }
        for(int i = 0; i < m; i++){
            crr[k++] = brr[i];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Array Size : ");
        int size1 = sc.nextInt();
        int arr[] = new int[size1];
        generateArray(arr);
        System.out.println("Array 1 -> " + Arrays.toString(arr));
        System.out.print("Enter Second Array Size : ");
        int size2 = sc.nextInt();
        int brr[] = new int[size2];
        generateArray(brr);
        System.out.println("Array 2 -> " + Arrays.toString(brr));
        int crr[] = new int[size1 + size2];
        mergeArray(arr, brr, crr);
        System.out.println("Merged Array -> " + Arrays.toString(crr));
    }
}