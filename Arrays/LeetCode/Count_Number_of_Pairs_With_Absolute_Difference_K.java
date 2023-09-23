public class Count_Number_of_Pairs_With_Absolute_Difference_K{
    public int countKDifference(int[] nums, int k) {
        int n = nums.length, pairs = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                int diff = nums[i] - nums[j];
                if(diff == k || diff == -k){
                    pairs++;
                }
            }
        }
        return pairs;
    }
}