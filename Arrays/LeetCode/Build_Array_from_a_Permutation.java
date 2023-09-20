import java.util.Arrays;
public class Build_Array_from_a_Permutation{
    public static void main(String[] args){
        int arr[] = {5,0,1,2,3,4};
        Build_Array_from_a_Permutation obj = new Build_Array_from_a_Permutation();
        System.out.println("Result is : " + Arrays.toString(obj.buildArray(arr)));
    }
    public int[] buildArray(int[] nums){
        int n = nums.length;
        int ans[] = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}