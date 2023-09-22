import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Count_Smaller_or_Equal_elements_in_array{
    public static void main(String[] args){
        int arr[] = {-2, 1, 3, 0};
        int brr[] = {-1, 0, 2, 1};
        System.out.println(countSmallerOrEqual(arr, brr, arr.length, brr.length));
    }
    public static List<Integer> countSmallerOrEqual(int[] a, int[] b, int n, int m){
        Arrays.sort(b);
        List<Integer> list = new ArrayList<>();
        for(int target : a){
            list.add(countElements(b, target));
        }
        return list;
    }
    public static int countElements(int arr[], int target){
        int ans = -1, start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] <= target){
                ans = mid;
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return ans + 1;
    }
}