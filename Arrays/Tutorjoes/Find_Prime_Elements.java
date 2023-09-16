import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Find_Prime_Elements{
    public static void generateArray(int arr[]){
        Random rd = new Random();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = rd.nextInt(1, 100);
        }
    }
    public static void primeElements(int arr[]){
        for(int element : arr){
            if(isPrime(element)){
                System.out.println(element + " - Prime");
            } else{
                System.out.println(element + " - Not Prime");
            }
        }
    }
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        } if(n == 2 || n == 3){
            return true;
        } if(n % 2 == 0 || n % 3 == 0){
            return false;
        } for(int i = 5; i * i <= n; i = i + 6){
            if(n % i == 0 || n % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        generateArray(arr);
        System.out.println("Array -> " + Arrays.toString(arr));
        System.out.println("Prime & Non Prime Elements -> ");
        primeElements(arr);
    }
}