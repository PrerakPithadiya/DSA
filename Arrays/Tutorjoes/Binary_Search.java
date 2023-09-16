public class Binary_Search{
    public static void main(String[] args){
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = 60;
        int index = binarySearch(arr, key);
        if(index == -1){
            System.out.println("Element doesn't found in array!");
        } else{
            System.out.println("Element is found at index -> " + index);
        }
    }
    public static int binarySearch(int arr[], int key){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == key){
                return mid;
            } if(arr[mid] < key){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return -1;
    }
}