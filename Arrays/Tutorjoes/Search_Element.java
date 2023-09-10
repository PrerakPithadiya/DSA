import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Search_Element{
    public static void generateArray(int arr[]){
        Random rd = new Random();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt(0, 100);
        }
    }
    public static int searchElement(int arr[], int x){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        generateArray(arr);
        System.out.println("Array -> " + Arrays.toString(arr));
        System.out.print("Enter the Element : ");
        int x = sc.nextInt();
        int index = searchElement(arr, x);
        if(index == -1){
            System.out.println("The given element isn't found in array!");
        } else{
            System.out.println("The given element is found at index -> " + index);
        }
    }
}