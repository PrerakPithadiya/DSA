import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Find_Even_Elements_in_Two_Arrays{
    public static void generateArray(int arr[]){
        Random rd = new Random();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt(0, 100);
        }
    }
    public static List<Integer> findEvensinTwo(int arr1[], int arr2[]){
        List<Integer> list = new ArrayList<>();
        for(int element : arr1){
            if(element % 2 == 0){
                list.add(element);
            }
        }
        for(int element : arr2){
            if(element % 2 == 0){
                list.add(element);
            }
        }
        return list;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array 1 Size : ");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        generateArray(arr1);
        System.out.println("Array 1 -> " + Arrays.toString(arr1));
        System.out.print("Enter Array 2 Size : ");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];
        generateArray(arr2);
        System.out.println("Array 2 -> " + Arrays.toString(arr2));
        System.out.println("Even Elements -> " + findEvensinTwo(arr1, arr2));
    }
}