public class Operations_on_Arrays{
    public static void main(String[] args){
        int arr[] = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println("Original Array : [" + arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3] + ", " + arr[4] + "]");

        arr[4] = arr[4] + 1;

        System.out.println("Updated Array  : [" + arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3] + ", " + arr[4] + "]");
    }
}