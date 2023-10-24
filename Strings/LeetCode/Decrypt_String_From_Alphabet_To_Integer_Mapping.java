import java.lang.StringBuilder;
import java.util.HashMap;
public class Decrypt_String_From_Alphabet_To_Integer_Mapping{
    public static void main(String[] args){
        String str = "1326#";
        System.out.println(freqAlphabets(str));
    }
    public static String freqAlphabets(String s){
        StringBuilder sb = new StringBuilder();
        HashMap<String, Character> map = new HashMap<String, Character>();
        insertData(map);
        int n = s.length();
        for(int i = n - 1; i >= 0; i--){
            String ch = "" + s.charAt(i);
            if(ch.equals("#")){
                String str = "" + s.charAt(i - 2) + s.charAt(i - 1) + s.charAt(i);
                sb.append(map.get(str));
                i -= 2;
            } else{
                sb.append(map.get(ch));
            }
        }
        return sb.reverse().toString();
    }
    public static void insertData(HashMap<String, Character> m){
        m.put("1", 'a');      m.put("10#", 'j');      m.put("19#", 's');
        m.put("2", 'b');      m.put("11#", 'k');      m.put("20#", 't');
        m.put("3", 'c');      m.put("12#", 'l');      m.put("21#", 'u');
        m.put("4", 'd');      m.put("13#", 'm');      m.put("22#", 'v');
        m.put("5", 'e');      m.put("14#", 'n');      m.put("23#", 'w');
        m.put("6", 'f');      m.put("15#", 'o');      m.put("24#", 'x');
        m.put("7", 'g');      m.put("16#", 'p');      m.put("25#", 'y');
        m.put("8", 'h');      m.put("17#", 'q');      m.put("26#", 'z');
        m.put("9", 'i');      m.put("18#", 'r');      
    }
}