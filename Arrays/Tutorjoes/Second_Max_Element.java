import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Second_Max_Element{
    public static void generateArray(int arr[]){
        Random rd = new Random();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt(0, 100);
        }
    }
    public static int findSecondMax(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = n - 1; i >= 1; i--){
            if(arr[i] != arr[i - 1]){
                return arr[i - 1];
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
        int secMax = findSecondMax(arr);
        if(secMax == -1){
            System.out.println("Second Maximum Element isn't Found!");
        } else{
            System.out.println("Second Maximum Element -> " + secMax);
        }
    }
}