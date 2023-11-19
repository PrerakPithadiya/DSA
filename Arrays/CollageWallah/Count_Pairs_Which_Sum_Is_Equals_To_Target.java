import java.util.Scanner;
public class Count_Pairs_Which_Sum_Is_Equals_To_Target{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " Elements : ");
        generateArray(arr);
        System.out.print("Enter the Target : ");
        int target = sc.nextInt();
        int pairs = countPairs(arr, target);
        System.out.println("The Number of Pairs are : " + pairs);
    }
    public static void generateArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static int countPairs(int arr[], int target){
        int count = 0, n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    count++;
                }
            }
        }
        return count;
    }
}