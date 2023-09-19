public class First_Occurrence{
    public static void main(String[] args){
        int arr[] = {1, 2, 2, 5, 5, 5, 5, 5, 6, 6, 6};
        int key = 2;
        int index1 = firstOccurrenceBinarySearch(arr, key);
        int index2 = firstOccurrenceLinearSearch(arr, key);
        System.out.println("Binary Search Index : " + index1);
        System.out.println("Linear Search Index : " + index2);
    }
    public static int firstOccurrenceBinarySearch(int arr[], int target){
        // in binary search for first occurrence array must be sorted!
        int n = arr.length, start = 0, end = n - 1, firstOccurrence = -1;
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
    public static int firstOccurrenceLinearSearch(int arr[], int target){
        int n = arr.length, firstOccurrence = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                firstOccurrence = i;
                return firstOccurrence;
            }
        }
        return firstOccurrence;
    }
}