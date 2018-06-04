// https://www.interviewbit.com/problems/all-factors/

public class Solution {
	public ArrayList<Integer> allFactors(int a) {
	    
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        int sqrt = (int) Math.sqrt(a);
        
        for (int i = 1; i <= sqrt; i++) {
            if (a % i == 0) {
                list.add(i);
                list1.add(a / i);
            }
        }
        
        for (int x = list1.size() - 1; x >= 0; x--) {
            if (!list.contains(list1.get(x))) list.add(list1.get(x));
        }
        
        return list;
	}
}