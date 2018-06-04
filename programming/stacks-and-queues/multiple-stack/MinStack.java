// https://www.interviewbit.com/problems/min-stack/

class Solution {
    
    private int top = -1;
    private ArrayList<Integer> list = new ArrayList<>();
    private int minEle = -1;
    
    public void push(int x) {
        
        if (top == -1) {
            list.add(++top, x);
            minEle = x;
            
        } else if (x >= minEle) {
            list.add(++top, x);
            
        } else {
            list.add(++top, 2 * x - minEle);
            minEle = x;
        }
    }

    public void pop() {
        
        if (top == -1) return;
        int y = list.get(top--);
        
        if (y < minEle) minEle = 2 * minEle - y;
    }

    public int top() {
        
        if (top == -1) return -1;
        
        int t = list.get(top);
        
        if (t >= minEle) return t;
        return minEle;
    }

    public int getMin() {
        
        if (top == -1) return -1;
        return minEle;
    }
}
