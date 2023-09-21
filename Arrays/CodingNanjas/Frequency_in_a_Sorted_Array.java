public class Frequency_in_a_Sorted_Array{
    public static void main(String[] args){
        int arr[] = {5, 7, 7, 8, 8, 10};
        int key = 10;
        int result = countOccurrences(arr, key);
        System.out.println("Occurrences : " + result);
    }
    public static int countOccurrences(int[] arr, int x){
        int first = firstOccurrence(arr, x);
        if(first == -1){
            return 0;
        }
        int last = lastOccurrence(arr, x);
        return last - first + 1;
	}
    public static int firstOccurrence(int arr[], int target){
        int start = 0, end = arr.length - 1, firstOccurrence = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                firstOccurrence = mid;
                end = mid - 1;
            } else if(arr[mid] < target){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return firstOccurrence;
    }
    public static int lastOccurrence(int arr[], int target){
        int start = 0, end = arr.length - 1, lastOccurrence = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                lastOccurrence = mid;
                start = mid + 1;
            } else if(arr[mid] < target){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return lastOccurrence;
    }
}