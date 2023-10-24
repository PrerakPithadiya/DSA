import java.lang.StringBuilder;
public class Goal_Parser_Interpretation{
    public static void main(String[] args){
        String str = "(al)G(al)()()G";
        System.out.println(interpret(str));
    }
    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int n = command.length();
        for(int i = 0; i < n; i++){
            char ch = command.charAt(i);
            if(ch == 'G'){
                sb.append("G");
            } else{
                if(command.charAt(i + 1) == ')'){
                    sb.append("o");
                    i++;
                } else{
                    sb.append("al");
                    i += 3;
                }
            }
        }
        return sb.toString();
    }
}