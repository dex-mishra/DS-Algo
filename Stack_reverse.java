import java.util.*;
public class Stack_reverse {
    public void pushBottom(Stack<Integer> st,int data)
    {
        if (st.isEmpty()) {
            st.push(data);
        }
        else
        {
            int top = st.pop();
            pushBottom(st, data);
            st.push(top);
        }
    }
    public void reverseStack(Stack<Integer> st)
    {
        if (st.isEmpty()) {
            return;
        }
        else
        {
            int top = st.pop();
            reverseStack(st);
            pushBottom(st, top);
        }
    }
 
    public  void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(10);
        st.push(20);
        st.push(30);
        pushBottom(st, 1);
       reverseStack(st);
        while(!st.isEmpty())
        {
            System.out.println(st.pop());
        }
        
    }
}