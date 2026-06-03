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

public class Linked_List_Nth_End {
    public Node Nth_end_del(Node head,int n)
    {
        Node fast = head;
        Node slow = head;
        if (head==null) {
            return head;
        }
        for( int i=0;i<n;i++)
        {
            if(fast.next==null)
            {
                System.out.println("N is less than size of LL");
                return head;
            }
            fast = fast.next;
        }
        while(fast.next!=null)
        {
            slow = slow.next;
            System.out.println("SLOW :" + slow.data);
            fast= fast.next;
            System.out.println("FAST :" + fast.data);
        }
        slow.next=slow.next.next;
        
        return head; 
    }
    public void main(String[] args) {
        Node LL = new Node(5);
        LL.addlast(LL, 10);
        LL.addlast(LL, 20);
        LL.addlast(LL, 30);
        LL.addlast(LL, 40);
        LL.printLL(LL);
        LL = Nth_end_del(LL,2);
        System.out.println("NEW LIST");
        LL.printLL(LL);
    }
}
