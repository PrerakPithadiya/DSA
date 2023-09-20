public class Find_Smallest_Letter_Greater_Than_Target{
    public static void main(String[] args){
        char arr[] = {'c','f','j'};
        char key = 'a';
        Find_Smallest_Letter_Greater_Than_Target obj = new Find_Smallest_Letter_Greater_Than_Target();
        char result = obj.nextGreatestLetter2(arr, key);
        System.out.println("Result is : " + result);
    }
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = ' ';
        int start = 0, end = letters.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < letters[mid]){
                ans = letters[mid];
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        if(ans == ' '){
            return letters[0];
        }
        return ans;
    }
    public char nextGreatestLetter2(char[] letters, char target){
        int n = letters.length;
        for(int i = 0; i < n; i++){
            if(target < letters[i]){
                return letters[i];
            }
        }
        return letters[0];
    }
}