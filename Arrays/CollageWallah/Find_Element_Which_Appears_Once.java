import java.util.Scanner;
public class Find_Element_Which_Appears_Once{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " Elements : ");
        generateArray(arr);
        int unique = findUnique(arr);
        System.out.println("The Unique Element is : " + unique);
    }
    public static void generateArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static int findUnique(int arr[]){
        int n = arr.length, ans = arr[0];
        for(int i = 1; i < n; i++){
            ans = ans ^ arr[i];
        }
        return ans;
    }
}