import java.util.Arrays;
public class Find_Unique{
    public static void main(String[] args){
        int arr[] = {1,3,1,3,6,6,7,10,7};
        int result = findUnique(arr);
        System.out.println("Result is : " + result);
    }
    public static int findUnique(int[] arr){
        Arrays.sort(arr); int n = arr.length;
        for(int i = 0; i < n - 1; i += 2){
            if(arr[i] != arr[i + 1]){
                return arr[i];
            }
        }
        return arr[n - 1];
    }
}