package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ReverseNode x = new ReverseNode();
        x.addLast(60);
        x.addLast(70);
        x.addLast(80);
        x.addLast(90);

        System.out.println("Original Linked List:");
        x.display();

        x.reverseNodes();

        System.out.println("\n\n"+"reversed one: ");
        x.display();

    }
}
class Node2
{
    int data;
    Node2 next = null;

    Node2(int data)
    {
        this.data = data;
    }
}
class ReverseNode
{
    Node2 head;
    public void addLast(int val)
    {
        Node2 nn = new Node2(val);
        if(head == null)
        {
            head = nn;
            return;
        }
        Node2 curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = nn;
    }
    public void display()
    {
        Node2 curr = head;
        while(curr != null)
        {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
    }
    public void reverseNodes()
    {
        Node2 prev = null;
        Node2 curr = head;

        while(curr != null)
        {
            Node2 nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        head = prev;
    }
}

