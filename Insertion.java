package LinkedList;
import java.util.*;
public class Insertion {
	static Node head;
static class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public static LinkedList insertionAtBeg(LinkedList list,int data)
{
	Node n=new Node(data);
	if(head==null)
	{
		head=n;
		
	}
	else
	{
	   n.next=head;
	   head=n;
	   
	}
	return list;
}
public static LinkedList insertionAtEnd(LinkedList list,int data)
{
	Node p=new Node(data);
	if(head==null)
	{
		head=p;
	}
	else
	{
		Node te=head;
		while(te.next!=null)
		{
			te=te.next;
		}
		te.next=p;
		p.next=null;
	}
	return list;
}
public static LinkedList insertionAtPos(LinkedList list,int data,int pos)
{
	Node q=new Node(data);
	Node temp=head;
	for(int i=1;i<pos-1;i++)
	{
		temp=temp.next;
	}
	q.next=temp.next;
	temp.next=q;
	return list;
	
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
list=insertionAtBeg(list,1);
list=insertionAtBeg(list,2);
list=insertionAtBeg(list,3);
   list=insertionAtEnd(list,5);
  list=insertionAtEnd(list,8);
  list=insertionAtEnd(list,11);
  list=insertionAtPos(list,16,3);
	printList(list);
}
}
