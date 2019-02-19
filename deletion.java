package LinkedList;
import java.util.*;

import LinkedList.Insertion.Node;
public class deletion {
	static Node head;
	static class Node
	{
		int data;
		Node next;
		 Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}

public static LinkedList add(LinkedList list,int data)
{
	Node n=new Node(data);
	if(head==null)
		head=n;
	else
	{
		Node temp=head;
	while(temp.next!=null)
	{
		temp=temp.next;
	}
	temp.next=n;
	n.next=null;
	}
	return list;
	
}


	public static void deletion(LinkedList list,int position)
	{
		if (head == null) 
            return ; 
        Node temp = head;
        if (position == 0) 
        { 
            head = temp.next;
            return ; 
        } 
        for (int i=0; temp!=null && i<position-1; i++) 
            temp = temp.next;
        if (temp == null || temp.next == null) 
            return;  
        Node next = temp.next.next; 
  
        temp.next = next;
    } 
	public static void printList(LinkedList list)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
			
		}
	}

	public static void main(String args[])
	{
		LinkedList list=new LinkedList();
		list=add(list,20);
		list=add(list,30);
		list=add(list,40);
		list=add(list,50);
		list=add(list,60);
		deletion(list,2);
		printList(list);
	}

}
