import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Frequency_of_Elements{
    public static void generateArray(int arr[]){
        Random rd = new Random();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt(0, 7);
        }
    }
    public static void elementsFrequency(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element : arr){
            if(map.containsKey(element)){
                map.put(element, map.get(element) + 1);
            } else{
                map.put(element, 1);
            }
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        generateArray(arr);
        System.out.println("Array -> " + Arrays.toString(arr));
        System.out.println("Frequency of Elements -> ");
        elementsFrequency(arr);
    }
}