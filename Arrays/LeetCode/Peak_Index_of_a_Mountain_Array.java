public class Peak_Index_of_a_Mountain_Array{
    public static void main(String[] args){
        int arr[] = {0, 10, 5, 2};
        Peak_Index_of_a_Mountain_Array obj = new Peak_Index_of_a_Mountain_Array();
        int index = obj.peakIndexInMountainArray(arr);
        System.out.println("Result Index is : " + index);
    }
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length, start = 0, end = n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]){
                return mid;
            } else if(arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]){
                end = mid;
            } else{
                start = mid;
            }
        }
        return -1;
    }
}
