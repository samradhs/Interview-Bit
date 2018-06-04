// https://www.interviewbit.com/problems/rain-water-trapped/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
        
        Stack s = new Stack();
        
        int count = 0;
        int maxNumStack = -1;
        
        for (Integer i: A) {
            
            if (s.isEmpty()) {
                if (i != 0) {
                    s.push(i);
                    maxNumStack = i;
                } 
                
                continue;
            }
            
            if (i >= maxNumStack) {
                int min = Math.min(i, maxNumStack);
                while(!s.isEmpty()) {
                    count += (min - s.pop());
                }
                
                s.push(i);
                maxNumStack = i;
                
            } else {
                s.push(i);
            }
        }
        
        if (!s.isEmpty()) maxNumStack = s.pop();
        while (!s.isEmpty()) {
            int num = s.pop();
            if (num <= maxNumStack) {
                count += (maxNumStack - num);
            } else {
                maxNumStack = num;
            }
        }
        
        return count;
    }
}

class Stack {
    
    private int top = -1;
    private ArrayList<Integer> list = new ArrayList<>();
    
    void push(int i) {
        list.add(++top, i);
    }
    
    int pop() {
        return list.get(top--);
    }
    
    int top() {
        return list.get(top);
    }
    
    boolean isEmpty() {
        return top == -1;
    }
}
