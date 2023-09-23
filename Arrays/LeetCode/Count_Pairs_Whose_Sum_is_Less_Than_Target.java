import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Count_Pairs_Whose_Sum_is_Less_Than_Target{
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>(Arrays.asList(-6,2,5,-2,-7,-1,3));
        int target = -2;
        System.out.println(countPairs(arr, target));
    }
    public static int countPairs(List<Integer> nums, int target) {
        int n = nums.size(), pairs = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(nums.get(i) + nums.get(j) < target){
                    pairs++;
                }
            }
        }
        return pairs;
    }
}