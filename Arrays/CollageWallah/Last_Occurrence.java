public class Last_Occurrence{
    public static void main(String[] args){
        int arr[] = {1, 2, 2, 5, 5, 5, 5, 5, 6, 6};
        int key = 1;
        int index1 = lastOccurrenceBinarySearch(arr, key);
        int index2 = lastOccurrenceLinearSearch(arr, key);
        System.out.println("Binary Search Index : " + index1);
        System.out.println("Linear Search Index : " + index2);
    }
    public static int lastOccurrenceBinarySearch(int arr[], int target){
        // in binary search for last occurrence array must be sorted!
        int n = arr.length, start = 0, end = n - 1, lastOccurrence = -1;
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
    public static int lastOccurrenceLinearSearch(int arr[], int target){
        int n = arr.length, lastOccurrence = -1;
        for(int i = n - 1; i >= 0; i--){
            if(arr[i] == target){
                lastOccurrence = i;
                return lastOccurrence;
            }
        }
        return lastOccurrence;
    }
}