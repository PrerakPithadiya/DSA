public class Print_Array{

    public static void printArray(int arr[]){
        int n = arr.length;
        System.out.print("[");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
            if(i < n - 1){ System.out.print(", "); }
        }
        System.out.println("]");
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4};

        System.out.print("Array -> ");
        printArray(arr);
    }
    
}