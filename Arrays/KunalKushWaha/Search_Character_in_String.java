import java.util.Scanner;
public class Search_Character_in_String{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.print("Enter the Character : ");
        char ch = sc.next().trim().charAt(0);
        boolean ans = isPresent(str, ch);
        String result = "";
        if(!ans){
            result = "isn't";
        } else{
            result = "is";
        }
        System.out.println("The character " + result + " present in string!");
    }
    public static boolean isPresent(String str, char ch){
        int n = str.length();
        if(n == 0){
            return false;
        }
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }
}