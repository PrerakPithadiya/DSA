public class Find_Peak_Element{
    public static void main(String[] args){
        int arr[] = {1,2,3,1};
        int result = findPeakElement(arr);
        System.out.println("Result is : " + result);
    }
    public static int findPeakElement(int[] nums) {
        if(nums.length == 1){
            return 0;
        } if(nums.length == 2){
            if(nums[0] > nums[1]){
                return 0;
            } else{
                return 1;
            }
        } if(nums[0] > nums[1]){
            return 0;
        } if(nums[nums.length - 2] < nums[nums.length - 1]){
            return nums.length - 1;
        }
        int n = nums.length, start = 0, end = n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]){
                return mid;
            } else if(nums[mid - 1] > nums[mid] && nums[mid] > nums[mid + 1]){
                end = mid;
            } else{
                start = mid;
            }
        }
        return -1;
    }
}