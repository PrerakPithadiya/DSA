import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Find_Unique_Elements{
    public static void generateArray(int arr[]){
        Random rd = new Random();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt(0, 10);
        }
    }
    public static int findUniqueElements(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int j = 0;
        for(int element : arr){
            if(map.containsKey(element)){
                map.put(element, map.get(element) + 1);
            } else{
                map.put(element, 1);
            }
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                arr[j++] = e.getKey();
            }
        }
        return j;
    }
    public static void printUniques(int arr[], int n){
        System.out.print("[");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
            if(i < n - 1){ System.out.print(", "); }
        }
        System.out.println("]");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        generateArray(arr);
        System.out.println("Array -> " + Arrays.toString(arr));
        int index = findUniqueElements(arr);
        System.out.print("Unique Elements -> ");
        printUniques(arr, index);
    }
}