public class Check_If_A_String_Is_An_Acronym_Of_Words{
    public static boolean isAcronym(List<String> words, String s) {
        if(words.size() != s.length()){
            return false;
        }
        int i = 0;
        for(String str : words){
            if(str.charAt(0) != s.charAt(i)){
                return false;
            }
            i++;
        }
        return true;
    }
}