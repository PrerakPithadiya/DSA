public class Peak_Index_of_a_Mountain_Array{
    public static void main(String[] args){
        int arr[] = {0, 10, 5, 2};
        Peak_Index_of_a_Mountain_Array obj = new Peak_Index_of_a_Mountain_Array();
        int index = obj.peakIndexInMountainArray(arr);
        System.out.println("Result Index is : " + index);
    }
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){
                return i;
            }
        }
        return 0;
    }
}