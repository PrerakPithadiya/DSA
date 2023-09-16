public class Find_Missing_Element{
    public static void main(String[] args){
        int arr[] = {1, 2, 4, 5, 6, 7}, n = 7, sum = 0;

        for(int element : arr){
            sum = sum + element;
        }
        n = (n * (n + 1)) / 2;
        
        int missElement = n - sum;
        System.out.println("Missing Element -> " + missElement);

    }
}