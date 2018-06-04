// https://www.interviewbit.com/problems/evaluate-expression/

public class Solution {
    
    private int top = -1;
    private List<Integer> list = new ArrayList<>();
    
    public int evalRPN(ArrayList<String> A) {
        
        if (A.isEmpty()) return -1;
        int op2;
        
        for (String s: A) {
            
            switch(s) {
                
                case "+":
                    op2 = pop();
                    push(pop() + op2);
                    break;
                    
                case "-":
                    op2 = pop();
                    push(pop() - op2);
                    break;
                    
                case "*":
                    op2 = pop();
                    push(pop() * op2);
                    break;
                    
                case "/":
                    op2 = pop();
                    push(pop() / op2);
                    break;
                    
                default:
                    push(Integer.parseInt(s));
                    break;
            }
        }
        
        return list.get(0);
    }
    
    private void push(int i) {
        top++;
        list.add(top, i);
    }
    
    private int pop() {
        return list.get(top--);
    }
}
