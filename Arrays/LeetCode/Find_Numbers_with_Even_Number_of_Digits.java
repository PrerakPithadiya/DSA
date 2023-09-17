import java.lang.StringBuilder;
public class Find_Numbers_with_Even_Number_of_Digits{
    public static void main(String[] args){
        int arr[] = {555, 901, 482, 1771};
        Find_Numbers_with_Even_Number_of_Digits cN = new Find_Numbers_with_Even_Number_of_Digits();
        System.out.println(cN.findNumbers(arr));
    }
    public int findNumbers(int[] nums) {
        // StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int element : nums){
            // sb.append(element);
            if(((int)(Math.log10(element)) + 1) % 2 == 0){
                count++;
            }
            // sb.setLength(0);
        }
        return count;
    }
}