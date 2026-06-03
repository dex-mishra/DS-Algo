// Counting N steps till end of the list then then counting N/2 steps to reach the middle of the list and 
// then comparing the first reversed half with the second half of the list

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

public class Linked_List_Palindrome_Brute {
    public Boolean Linked_List_Palindrome(Node head)
    {
        Node fast = head;
        Node slow = head;
        Node next =head;
        Node prev = null;
        int c=0;
        if (head==null|| head.next==null) 
        {
            return true;
        }
        else
        {
        while(fast!=null)
        {
            c++;
            fast = fast.next;
        }
        }
        if(c%2==0)
        {
            c=c/2;
            while(c>0)
        {
            next = slow.next;
            slow.next=prev;
            prev = slow;
            slow = next;
            c--;
        }
        }
        else
        {
        c=(c-1)/2;
        while(c>0)
        {
            next = slow.next;
            slow.next=prev;
            prev = slow;
            slow = next;
            c--;
        }
        slow = slow.next;
        }
        while(slow!=null)
        {
            if(slow.data!=prev.data)
            {
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }
        return true; 
    }
    public void main(String[] args) {
        Node LL = new Node(5);
        LL.addlast(LL, 10);
        LL.addlast(LL, 20);
        LL.addlast(LL, 10);
        LL.addlast(LL, 15);
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
