import java.util.Arrays;
public class Span_of_an_Array{
    public static void main(String[] args){
        int arr[] = {20, 42, 88, 10, 99, 6};
        int span = arraySpan(arr);
        System.out.println("Span of an Array : " + span);
    }
    public static int arraySpan(int arr[]){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int element : arr){
            if(max < element){
                max = element;
            } if(min > element){
                min = element;
            }
        }
        return max - min;
    }
    public static int arraySpan2(int arr[]){
        Arrays.sort(arr);
        int min = arr[0], max = arr[arr.length - 1];
        return max - min;
    }
}