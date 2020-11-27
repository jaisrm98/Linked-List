package Linklist;

public class Delete_node {
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	void add(int data)
	{
		Node first=new Node(data);
		first.next=head;
		head=first;
	}
	void delete(Node node)
	{
		
		node.data=node.next.data;
		node.next=node.next.next;
	}
	void traverse(Node n)
	{
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public static void main(String args[])
	{
		Delete_node list=new Delete_node();
		list.head=new Node(1);
		Node first=new Node(2);
		Node second=new Node(3);
		list.head.next=first;
		first.next=second;
		list.traverse(head);
		System.out.println();
		list.delete(first);
		list.traverse(head);
	}
}

Output: 1 2 3 
	1 3 
