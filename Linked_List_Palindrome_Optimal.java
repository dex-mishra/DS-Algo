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

public class Linked_List_Palindrome_Optimal {
    public static Boolean Linked_List_Palindrome(Node head)
    {
        Node fast = head;
        Node slow = head;  
        
        if (head == null || head.next == null) 
        {
            return true;
        }
        
        while (fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node curr = slow.next;
        Node prev = null;
        Node next;
        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        Node p1 = head;
        Node p2 = prev;
        
        while (p2 != null)
        {
            if (p1.data != p2.data)
            {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return true; 
    }
    public static void main(String[] args) {
        Node LL = new Node(5);
        LL.addlast(LL, 10);
        LL.addlast(LL, 20);
        LL.addlast(LL, 10);
        LL.addlast(LL, 5);
        LL.printLL(LL);
        if(Linked_List_Palindrome(LL))
            {
                System.out.println("Palindrome");
            }
            else{
                System.out.println("NOT Palindrome");
            }
    }
}
