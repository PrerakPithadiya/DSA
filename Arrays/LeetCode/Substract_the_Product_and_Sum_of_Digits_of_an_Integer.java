public class Substract_the_Product_and_Sum_of_Digits_of_an_Integer{
    public static void main(String[] args){
        int result = subtractProductAndSum(4421);
        System.out.println(result);
    }
    public static int subtractProductAndSum(int n) {
        int r = 0, product = 1, sum = 0;
        while(n != 0){
            r = n % 10;
            product = product * r;
            sum = sum + r;
            n /= 10;
        }
        return product - sum;
    }
}