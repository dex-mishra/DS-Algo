import java.util.*;
public class Stack_Push_Bottom {
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
 
    public  void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(10);
        st.push(20);
        st.push(30);
        pushBottom(st, 1);
        while(!st.isEmpty())
        {
            System.out.println(st.pop());
        }
        
    }
}