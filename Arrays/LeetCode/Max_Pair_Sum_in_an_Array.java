public class Max_Pair_Sum_in_an_Array{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        System.out.println(maxSum(arr));
    }
    public static int maxSum(int[] nums) {
        int maxSum = -1, n = nums.length;
        for(int i = 0; i < n - 1; i++){
            int maxDigit1 = findMaxDigit(nums[i]);
            for(int j = i + 1; j < n; j++){
                int maxDigit2 = findMaxDigit(nums[j]);
                if(maxDigit1 == maxDigit2){
                    int currSum = nums[i] + nums[j];
                    if(maxSum < currSum){
                        maxSum = currSum;
                    }
                }
            }
        }
        return maxSum;    
    }
    public static int findMaxDigit(int n){
        int maxDigit = -1;
        while(n != 0){
            int r = n % 10;
            if(maxDigit < r){
                maxDigit = r;
            }
            n /= 10;
        }
        return maxDigit;
    }
}