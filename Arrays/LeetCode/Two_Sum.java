import java.util.Arrays;
public class Two_Sum{
    public static void main(String[] args){
        int arr[] = {3,3};
        int key = 6;
        System.out.println(Arrays.toString(twoSum(arr, key)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}