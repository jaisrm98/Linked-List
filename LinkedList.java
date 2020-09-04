package set;

public class LinkedList {
	 static Node head;
	public static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	public void add(int data)
	{
		Node first=new Node(data);
			first.next=head;
			head=first;
	}
	
	public void traverse(Node n)
	{
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		 System.out.println(" ");
	}
	   
	Node reverse(Node node)
	{
		Node current=node;
		 Node previous=null;
		Node next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		node=previous;
		return node;
	}
	
	public static void main(String args[])
	{
		LinkedList list=new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.traverse(head);
		head=list.reverse(head);
		list.traverse(head);
		
		
	}
}
