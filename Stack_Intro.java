class StackNode {
    int data;
    StackNode next;
    
    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
    public StackNode add(StackNode head,int data){
        StackNode nd = new StackNode(data);
        nd.next = head;
        return nd;
    }
    public void printLL(StackNode head){
         StackNode current = head;
        while(current.next!=null)
        {   
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.println(current.data);
    }
}
public class Stack_Intro {
    StackNode head = null;

    void push(int data)
    {
        if (head == null) {
            head = new StackNode(data);
        } else {
            head = head.add(head, data);
        }
    }
    void pop()
    {
        if (head==null) {
            System.out.println("Stack is empty");
        }
        else
        {
            head = head.next;
        }
    }
    void peek()
    {
        if (head==null) {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println(head.data);
        }
    }
    
    public static void main(String[] args) {
        Stack_Intro st = new Stack_Intro();
        st.push(5);
        st.push(10);
        st.push(20);
        st.push(30);
        
        st.peek();
        st.pop();
        st.peek();
        st.push(40);
        st.peek();
        if (st.head != null) {
            st.head.printLL(st.head);
        }
    }
}