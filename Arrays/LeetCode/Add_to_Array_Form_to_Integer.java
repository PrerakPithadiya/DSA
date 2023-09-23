import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.math.BigInteger;
public class Add_to_Array_Form_to_Integer{
    public static void main(String[] args){
        int arr[] = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k = 516;
        System.out.println(addToArrayForm(arr, k));
    }
    public static List<Integer> addToArrayForm(int[] arr, int k){
        StringBuilder sb = new StringBuilder();
        for(int element : arr){
            sb.append(element);
        }
        BigInteger bi1 = new BigInteger(sb.toString());
        BigInteger bi2 = new BigInteger(Integer.toString(k));
        BigInteger sum = bi1.add(bi2);
        sb.delete(0, sb.length());
        sb.append(sum.toString());
        int n = sb.length();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ans.add(sb.charAt(i) - 48);
        }
        return ans;
    }
}