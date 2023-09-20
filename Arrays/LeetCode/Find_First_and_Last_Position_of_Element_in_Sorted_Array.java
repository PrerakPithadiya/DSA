public class Find_First_and_Last_Position_of_Element_in_Sorted_Array{
    public static void main(String[] args){
        int arr[] = {};
        int key = 0;
        Find_First_and_Last_Position_of_Element_in_Sorted_Array obj = new Find_First_and_Last_Position_of_Element_in_Sorted_Array();
        int result[] = obj.searchRange(arr, key).clone();
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
    public int[] searchRange(int[] nums, int target) {
        int ans1 = firstPosition(nums, target);
        if(ans1 == -1){
            return new int[]{ -1, -1 };
        }
        int ans2 = lastPosition(nums, target);
        return new int[]{ ans1, ans2 };
    }
    public static int firstPosition(int arr[], int target){
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
    public static int lastPosition(int arr[], int target){
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
}