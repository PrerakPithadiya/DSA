public class Ceiling_of_a_Number{
    public static void main(String[] args){
        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        int key = 5;
        int result = ceilingValue(arr, key);
        System.out.println("Ceiling Number : " + result);
    }
    public static int ceilingValue(int arr[], int target){
        int start = 0, end = arr.length - 1, ans = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target <= arr[mid]){
                ans = arr[mid];
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return ans;
    }
}