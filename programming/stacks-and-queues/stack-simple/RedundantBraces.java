// https://www.interviewbit.com/problems/redundant-braces/

public class Solution {
    public int braces(String A) {
        
        if (A == null || A.equals("()")) return 0;
        
        Stack s = new Stack();
        
        for (int i = 0; i < A.length(); i++) {
            
            char c = A.charAt(i);
            switch(c) {
                
                case ' ':
                default:
                    break;
                    
                case ')':
                    char pop = s.pop();
                    if (pop == '(') return 1;
                    
                    while (pop != '(') pop = s.pop();
                    break;
                    
                case '(':
                case '+':
                case '-':
                case '*':
                case '/':
                    s.push(c);
                    break;
            }
        }
        
        return 0;
    }
}

class Stack {
    
    private int top = -1;
    ArrayList<Character> list = new ArrayList<>();
    
    void push(char c) {
        
        list.add(++top, c);
    }
    
    char pop() {
        
        return list.get(top--);
    }
}
