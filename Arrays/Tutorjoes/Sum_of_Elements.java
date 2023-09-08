import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Sum_of_Elements{   
    public static void generateArray(int arr[]){
        Random rd = new Random();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt(0, 100);
        }
    }
    public static int sumOfElements(int arr[]){
        int sum = 0;
        for(int element : arr){
            sum = sum + element;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        generateArray(arr);

        System.out.println("Array -> " + Arrays.toString(arr));

        int sum = sumOfElements(arr);
        System.out.println("The sum of elements is : " + sum);
    }
}