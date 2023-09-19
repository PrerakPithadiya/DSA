import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Binary_Search{
    public static void generateArray(int arr[]){
        Random rd = new Random();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt(0, 100);
        }
        Arrays.sort(arr);
    }
    public static int binarySearch(int arr[], int target){
        int n = arr.length, start = 0, end = n - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size -> ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        generateArray(arr);
        System.out.println("Array -> " + Arrays.toString(arr));
        System.out.print("Enter the Element : ");
        int element = sc.nextInt();
        int index = binarySearch(arr, element);
        System.out.print("Result : ");
        if(index != -1){
            System.out.println("The element is found at index -> " + index);
        } else{
            System.out.println("The element isn't found in array!");
        }
    }
}