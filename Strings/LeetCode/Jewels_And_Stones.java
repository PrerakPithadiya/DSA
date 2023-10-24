public class Jewels_And_Stones{
    public int numJewelsInStones(String jewels, String stones) {
        int sum = 0, count = 0;
        for(int i = 0; i < jewels.length(); i++){
            for(int j = 0; j < stones.length(); j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    count++;
                }
            }
            sum += count;
            count = 0;
        }
        return sum;
    }
}