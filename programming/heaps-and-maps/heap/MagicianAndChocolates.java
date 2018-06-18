// https://www.interviewbit.com/problems/magician-and-chocolates/

public class Solution {
    public int nchoc(int A, ArrayList<Integer> B) {
        
        if (A == 0 || B.isEmpty()) return 0;
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i: B) {
            if (!map.containsKey(i)) map.put(i, 1);
            else map.put(i, map.get(i) + 1);
        }
        
        long choc = 0;
        
        for (int i = 1; i <= A; i++) {
            
            int maxKey   = map.lastKey();
            int maxValue = map.get(maxKey);
            choc += maxKey;
            
            if (maxValue == 1) map.remove(maxKey);
            else map.put(maxKey, maxValue - 1);
            
            int floorMaxHalf = maxKey / 2;
            if (map.containsKey(floorMaxHalf)) map.put(floorMaxHalf, map.get(floorMaxHalf) + 1);
            else map.put(floorMaxHalf, 1);
        }
        
        int mod = (int) Math.pow(10, 9) + 7; 
        return (int) (choc % mod);
    }
}
