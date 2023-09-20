import java.util.Arrays;
public class Count_Elements_with_Strickly_Smaller_and_Greater_Elements{
    public static void main(String[] args){
        int arr[] = {-3, 3, 3, 90};
        Count_Elements_with_Strickly_Smaller_and_Greater_Elements obj = new Count_Elements_with_Strickly_Smaller_and_Greater_Elements();
        int result = obj.countElements(arr);
        System.out.println("Result is : " + result);
    }
    public int countElements(int nums[]){
        Arrays.sort(nums);
        int n = nums.length, count = 0;
        boolean con1 = false, con2 = false;
        for(int i = 1; i <= n - 2; i++){
            // strickly smaller elements
            if(nums[i - 1] < nums[i]){
                con1 = true;
            } else{
                con1 = smallerElement(nums, i);
            }

            // strickly larger element
            if(nums[i] < nums[i + 1]){
                con2 = true;
            } else{
                con2 = largerElement(nums, i);
            }

            if(con1 && con2){
                count++;
            }

            con1 = con2 = false;
        }
        return count;
    }
    public static boolean smallerElement(int arr[], int n){
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] < arr[n]){
                return true;
            }
        }
        return false;
    }
    public static boolean largerElement(int arr[], int n){
        for(int i = n + 2; i < arr.length; i++){
            if(arr[i] > arr[n]){
                return true;
            }
        }
        return false;
    }
}