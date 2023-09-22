class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length, sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}