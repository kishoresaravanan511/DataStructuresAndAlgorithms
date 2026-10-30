package LinkedList;

public class ReversePairsOfaLinkedList
{
    public static void main(String[] args)
    {
        LinkedList x = new LinkedListReversePairs();
        LinkedListReversePairs obj = (LinkedListReversePairs)x;
        obj.insertAtBeginning(40);
        obj.insertAtBeginning(30);
        obj.insertAtBeginning(20);
        obj.insertAtBeginning(10);

        obj.reversePairs();

        obj.display();
    }
}
class Node3 extends Node {
   // int data;
    //Node next;
    Node3(int data)
    {
        super(data);
    }
}
class LinkedListReversePairs extends LinkedList
{
    void reversePairs()  //in progress
    {
        Node curr = head;
        Node prev = null;
        while(curr != null)
        {

        }
    }
}
