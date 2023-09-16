import java.util.Arrays;
public class Move_Zeroes_to_End{
    public static void main(String[] args){
        int arr[] = {1, 0, 45, 34, 0, 67, 2, 0, 6, 67, 45, 2, 0, 10};
        System.out.println("Before -> " + Arrays.toString(arr));
        moveZeroes(arr);
        System.out.println("After -> " + Arrays.toString(arr));
    }
    public static void moveZeroes(int arr[]){
        int i = 0, j = arr.length - 1;
        while(i < j){
            if(arr[i] == 0 && arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } if(arr[i] != 0){
                i++;
            } if(arr[j] == 0){
                j--;
            }
        }
    }
}