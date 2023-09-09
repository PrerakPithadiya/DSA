import java.util.Scanner;
import java.util.Arrays;
public class Cube_Elements_in_Array{
    public static void insertElements(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements : ");
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void cubeElements(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = arr[i] * arr[i] * arr[i];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        insertElements(arr);
        System.out.println("Original Array -> " + Arrays.toString(arr));
        cubeElements(arr);
        System.out.println("Cube Array -> " + Arrays.toString(arr));
    }
}