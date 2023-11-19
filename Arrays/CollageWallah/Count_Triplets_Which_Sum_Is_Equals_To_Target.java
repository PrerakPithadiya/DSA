import java.util.Scanner;
public class Count_Triplets_Which_Sum_Is_Equals_To_Target{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " Elements : ");
        generateArray(arr);
        System.out.print("\nEnter the Target : ");
        int target = sc.nextInt();
        int triplets = countTriplets(arr, target);
        System.out.println("\nThe Number of Triplets are : " + triplets);
    }
    public static void generateArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static int countTriplets(int arr[], int target){
        int count = 0, n = arr.length;
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}