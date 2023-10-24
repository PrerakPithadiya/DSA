public class Letter_Combination_of_a_Phone_Number{
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        HashMap<Character, String> map = new HashMap<Character, String>();
        insertData(map);
        if(digits.length() == 0){
            return list;
        }
        if(digits.length() == 1){
            String str = map.get(digits.charAt(0));
            for(int i = 0; i < str.length(); i++){
                list.add("" + str.charAt(i));
            }
            return list;
        }
        if(digits.length() == 2){
            String str1 = map.get(digits.charAt(0));
            String str2 = map.get(digits.charAt(1));
            for(int i = 0; i < str1.length(); i++){
                for(int j = 0; j < str2.length(); j++){
                    list.add("" + str1.charAt(i) + str2.charAt(j));
                }
            }
            return list;
        }
        if(digits.length() == 3){
            String str1 = map.get(digits.charAt(0));
            String str2 = map.get(digits.charAt(1));
            String str3 = map.get(digits.charAt(2));
            for(int i = 0; i < str1.length(); i++){
                for(int j = 0; j < str2.length(); j++){
                    for(int k = 0; k < str3.length(); k++){
                        list.add("" + str1.charAt(i) + str2.charAt(j) + str3.charAt(k));
                    }
                }
            }
            return list;
        }
        if(digits.length() == 4){
            String str1 = map.get(digits.charAt(0));
            String str2 = map.get(digits.charAt(1));
            String str3 = map.get(digits.charAt(2));
            String str4 = map.get(digits.charAt(3));
            for(int i = 0; i < str1.length(); i++){
                for(int j = 0; j < str2.length(); j++){
                    for(int k = 0; k < str3.length(); k++){
                        for(int l = 0; l < str4.length(); l++){
                            list.add("" + str1.charAt(i) + str2.charAt(j) + str3.charAt(k) + str4.charAt(l));
                        }
                    }
                }
            }
            return list;
        }
        return list;
    }
    public static void insertData(HashMap<Character, String> map){
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }
}