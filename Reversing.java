package LinkedList;
import java.util.*;
   class Node{
	 int data;
	 Node next;
	 Node(int data)
	 {
		this.data=data;
		this.next=null;
	 }
}
public class Reversing {
	static Node head;
	public static LinkedList add(LinkedList list,int data)
	{
		Node n=new Node(data);
		if(head==null)
		{
		   head=n;
		}
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
	public static LinkedList rev(LinkedList list)
	{
		Node prev=null;
		Node curr=head;
		Node Next=null;
		Node temp=head;
		while(curr!=null)
		{
			Next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=Next;
			
			
		}
		head=prev;
		return list;
	}
	public static void print(LinkedList list)
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
	 list=add(list,1);
	 list=add(list,2);
	 list=add(list,3);
	 list=add(list,4);
	 list=add(list,5);
	list=rev(list);
	 print(list);
	 
		
	}

}
