// https://www.interviewbit.com/problems/nearest-smaller-element/

public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        
        ArrayList<Integer> res = new ArrayList<>();
        Stack s = new Stack();
        
        for (Integer i: A) {
            
            while (!s.isEmpty() && s.top() >= i) s.pop();
            
            if (s.isEmpty())    res.add(-1);
            else                res.add(s.top());
            
            s.push(i);
        }
        
        return res;
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
