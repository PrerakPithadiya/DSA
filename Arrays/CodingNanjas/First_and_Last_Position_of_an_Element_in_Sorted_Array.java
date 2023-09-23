import java.util.ArrayList;
import java.util.Arrays;
public class First_and_Last_Position_of_an_Element_in_Sorted_Array{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,3,5));
        int target = 2;
        System.out.println(Arrays.toString(firstAndLastPosition(list, list.size(), target)));
    }
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int first = firstOccurrence(arr, n, k);
        if(first == -1){
            return new int[]{-1, -1};
        }
        int last = lastOccurrence(arr, n, k);
        return new int[]{first, last};
    }
    public static int firstOccurrence(ArrayList<Integer> arr, int n, int target){
        int start = 0, end = n - 1, firstOccurrence = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr.get(mid) == target){
                firstOccurrence = mid;
                end = mid - 1;
            } else if(arr.get(mid) < target){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return firstOccurrence;
    }
    public static int lastOccurrence(ArrayList<Integer> arr, int n, int target){
        int start = 0, end = n - 1, lastOccurrence = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr.get(mid) == target){
                lastOccurrence = mid;
                start = mid + 1;
            } else if(arr.get(mid) < target){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return lastOccurrence;
    }
}