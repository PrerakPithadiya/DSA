import java.lang.StringBuilder;
public class Check_If_Two_Strings_Are_Equivalent{
    public static void main(String[] args){
        String arr[] = {"abc", "d", "defg"};
        String brr[] = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(arr, brr));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String str : word1){
            sb1.append(str);
        }
        for(String str : word2){
            sb2.append(str);
        }
        String str1 = sb1.toString();
        String str2 = sb2.toString();
        return str1.equals(str2);
    }
}