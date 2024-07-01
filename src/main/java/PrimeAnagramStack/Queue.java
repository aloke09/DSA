package PrimeAnagramStack;

import java.util.LinkedList;

class Node
{
    int data;
    Node next;

}
public class Queue
{
    public void show()
    {
        Node node=head;
        while(node.next!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
    Node head;
    public void push(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }
    public void peek1()
    {
        Node node=head;
        while(node.next!=null)
        {
            node=node.next;
        }
		System.out.println(node.data);
    }

    public void pop1()
    {
        Node node=head;
        node=node.next;
        Node prev=head;
        while(node.next!=null)
        {
//			System.out.println(node.data);
            node=node.next;
            prev=prev.next;
        }
        prev.next=null;

    }


}
