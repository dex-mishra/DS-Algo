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

public class Reverse_Linked_List {
    public Node Reverser(Node head)
    {
        Node current = head;
        Node prev =null;
        Node next = head;
        if (head==null || head.next==null) {
            return head;
        }
        while(current!=null)
        {
            next = current.next;
            current.next=prev;
            prev = current;
            current = next;
            
        }
        
        return prev;
    }
    public void main(String[] args) {
        Node LL = new Node(5);
        LL.addlast(LL, 10);
        LL.addlast(LL, 20);
        LL.addlast(LL, 30);
        LL.addlast(LL, 40);
        LL.printLL(LL);
        LL = Reverser(LL);
        System.out.println("NEW REVERSED LIST");
        LL.printLL(LL);
    }
}
