package LinkedList.SinglyLinkedList;

public class CountNodes
{
    public static void main(String[] args)
    {
        CountNodeLinkedList obj = new CountNodeLinkedList();
        obj.addAtlast(10);
        obj.addAtlast(20);
        obj.addAtlast(30);
        obj.addAtlast(40);

        obj.display();

        System.out.println(obj.countNode());
    }
}
class Node1
{
    int data;
    Node1 next;
    Node1(int data)
    {
        this.data = data;
    }
}
class CountNodeLinkedList
{
    Node1 head = null;
    public void addAtlast(int val) {
        Node1 nn = new Node1(val);
        if (head == null)
        {
            head = nn;
            return;
        }
        Node1 curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = nn;
    }
    public void display()
    {
        Node1 curr = head;
        while(curr != null)
        {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    //core logic of this file
    public int countNode()
    {
        int count = 0;
        Node1 curr = head;
        while(curr != null)
        {
            count++;
            curr = curr.next;
        }
        return count;
    }
}

