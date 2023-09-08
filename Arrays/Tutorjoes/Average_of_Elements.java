import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Average_of_Elements{
    public static void generateArray(int arr[]){
        Random rd = new Random();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt(0, 100);
        }
    }
    public static float averageOfElements(int arr[]){
        float n = arr.length;
        int sum = 0;
        for(int element : arr){
            sum = sum + element;
        }
        return sum / n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        generateArray(arr);

        System.out.println("Array -> " + Arrays.toString(arr));

        float average = averageOfElements(arr);
        System.out.println("The average of elements is : " + average);
    }
}