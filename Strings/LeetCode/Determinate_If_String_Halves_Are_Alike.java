public class Determinate_If_String_Halves_Are_Alike{
    public static void main(String[] args){
        String str = "book";
        System.out.println(halvesAreAlike(str));
    }
    public static boolean halvesAreAlike(String s) {
        int n = s.length(), count1 = 0, count2 = 0, i = 0, j = n -1;
        while(i < j){
            char ch1 = s.charAt(i), ch2 = s.charAt(j);
            if(isVowel(ch1)){
                count1++;
            } if(isVowel(ch2)){
                count2++;
            }
            i++;
            j--;
        }
        return count1 == count2;
    }
    public static boolean isVowel(char c){
        return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') || (c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U');
    }
}