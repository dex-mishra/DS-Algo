//Fast moves 2 steps and slow moves 1 step. When fast reaches the end of the list, 
// slow will be at the middle of the list.

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
    public void addlast(Node head,int data){
        Node nd = new Node(data);
        Node current = head;
        while(current.next!=null)
        {
            current = current.next;
        }
        current.next=nd;
        
    }
    public void printLL(Node head){
         Node current = head;
        while(current.next!=null)
        {   
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.println(current.data);
    }
}

public class Linked_List_Cycle {
    public static Boolean Linked_List_Cycle_Check(Node head)
    {
        Node fast = head;
        Node slow = head;
        
        if (head==null || head.next==null) 
        {
            return false;
        }
        else
        {
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) 
            {
                return true; 
            }
        }
        }
        
        return false; 
    }
    public static void main(String[] args) {
        Node LL = new Node(5);
        LL.addlast(LL, 10);
        LL.addlast(LL, 20);
        LL.addlast(LL, 30);
        LL.addlast(LL, 100);
        
        LL.printLL(LL);
        if(Linked_List_Cycle_Check(LL))
        {
            System.out.println("Cycle is present");
        }
        else
        {
            System.out.println("Cycle is not present");
        }
    }
}
