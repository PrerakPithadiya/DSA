import java.util.Arrays;
public class Concetination_of_Array{
    public static void main(String[] args){
        int arr[] = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int nums[]){
        int n = nums.length;
        int ans[] = new int[2 * n];
        int i = 0, j = n, k = 0;
        while(k < n){
            ans[i++] = nums[k];
            ans[j++] = nums[k];
            k++;
        }
        return ans;
    }
}