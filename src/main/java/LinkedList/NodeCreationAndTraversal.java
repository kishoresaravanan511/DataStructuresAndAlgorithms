package LinkedList;

public class NodeCreationAndTraversal {
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        ll.insertAtBeginning(10);
        ll.insertAtBeginning(20);
        ll.insertAtBeginning(30);
        ll.insertAtBeginning(40);

//        ll.insertAtEnd(90);
//        ll.insertAtEnd(80);
//        ll.insertAtEnd(70);
//        ll.insertAtEnd(60);
//        ll.insertAtEnd(40);

        //ll.deleteAtBeginning();

        //ll.deleteAtEnd();

        ll.insertNodeAtIndex(4,50);

        System.out.println("Linked List: ");
        ll.display();
        System.out.println("\n" + "Sum of Nodes " + ll.sumOfNodes());
    }
}
class Node
{
    int data;
    Node next;   //hold the next node's reference

    public Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
class LinkedList
{
    Node head = null;
    public void insertAtBeginning(int val)
    {
        Node nn = new Node(val);
        if(head == null)
        {
            head = nn;
            return;
        }
        nn.next = head;
        head = nn;
    }
    public void insertAtEnd(int val)
    {
        Node nn = new Node(val);
        if(head == null)   //may hit the nullpointerexception , because head is only a reference, there is no object with new
        {
           head = nn;
           return;
        }
        Node curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = nn;
    }
    public void deleteAtBeginning()
    {
        if(head == null)
            return;
        head = head.next;
    }
    public void deleteAtEnd()
    {
        Node curr = head;
        while(curr.next != null && curr.next.next != null)
        {
            curr = curr.next;
        }
        curr.next = null;
    }

    public void insertNodeAtIndex(int ind,int val)
    {
       Node nn = new Node(val);
       if(ind == 0)
       {
            nn.next = head;
            head = nn;
            return;
       }
       Node curr = head;
       for(int i=0;i<ind-1 && curr != null;i++)
       {
           curr = curr.next;
       }
        if(curr == null)
        {
            System.out.println("Invalid Index");
            return;
        }
        nn.next = curr.next;
        curr.next = nn;
    }
    public int sumOfNodes()
    {
        Node curr = head;
        int sum = 0;
        while(curr != null)
        {
            sum+=curr.data;
            curr = curr.next;
        }
        return sum;
    }
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
    }
}
