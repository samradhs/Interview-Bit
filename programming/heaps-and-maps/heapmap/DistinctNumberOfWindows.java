// https://www.interviewbit.com/problems/distinct-numbers-in-window/

public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        
        ArrayList<Integer> result = new ArrayList<>();
        if (A.size() < B) return result;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < B; i++) {
            int val = A.get(i);
            
            if (map.containsKey(val)) map.put(val, map.get(val) + 1);
            else map.put(val, 1);
        }
        
        result.add(map.size());
        
        for (int i = B; i < A.size(); i++) {
            
            int val = A.get(i);
            int del = A.get(i - B);
            
            if (del != val) {
                int count = map.get(del);
                if (count == 1) map.remove(del);
                else map.put(del, count - 1);
                
                if (map.containsKey(val)) map.put(val, map.get(val) + 1);
                else map.put(val, 1);
            } 
            
            result.add(map.size());
        }
        
        return result;
    }
}
