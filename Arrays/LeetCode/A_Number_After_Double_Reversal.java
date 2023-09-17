public class A_Number_After_Double_Reversal{
    public static void main(String[] args){
        A_Number_After_Double_Reversal obj = new A_Number_After_Double_Reversal();
        int n = 0;
        System.out.println(obj.isSameAfterReversals(n));
    }
    public boolean isSameAfterReversals(int num) {
        int n = num;
        int rev = reverse(n);
        n = rev;
        rev = reverse(n);
        return num == rev;
    }
    public static int reverse(int n){
        int r = 0, rev = 0;
        while(n > 0){
            r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }
        return rev;
    }
}