public class Remove_Stars_From_a_String{
    StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == '*'){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i - 1);
                i -= 2;
            }
        }
        return sb.toString();
}