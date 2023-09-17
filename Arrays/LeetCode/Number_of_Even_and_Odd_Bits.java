import java.util.Arrays;
public class Number_of_Even_and_Odd_Bits{
    public static void main(String[] args){
        int n = 17;
        Number_of_Even_and_Odd_Bits cB = new Number_of_Even_and_Odd_Bits();
        System.out.println(Arrays.toString(cB.evenOddBit(n)));
    }
    public int[] evenOddBit(int n) {
        String str = Integer.toBinaryString(n);
        int length = str.length(), even = 0, odd = 0;
        for(int i = 0; i < length; i++){
            int index = length - 1 - i;
            char ch = str.charAt(i);
            if(ch == '1'){
                if(index % 2 == 0){
                    even++;
                } else{
                    odd++;
                }
            }
        }
        return new int[]{ even, odd };
    }
}
