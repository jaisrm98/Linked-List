package Linklist;

public class Middle_Node {
	static Node head;
	public static class Node
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
	 Node middle(Node head)
	{
		Node f=head;
		Node s=head;
		while(f!=null && f.next!=null)
		{
			f=f.next.next;
			s=s.next;
		}
		return s;
	}
	 int midnode()
	 {
		 Node f=head;
		 Node s=head;
		 while(f!=null && f.next!=null)
		 {
			 f=f.next.next;
			 s=s.next;
		 }
		 return s.data;
	 }
	void traverse(Node n)
	{
		n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public static void main(String args[])
	{
		Middle_Node list=new Middle_Node();
		list.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node forth=new Node(4);
		list.head.next=second;
		second.next=third;
		third.next=forth;
		list.traverse(head);
		System.out.println("\nprint mid node value");
		System.out.println(list.midnode());
		System.out.println("\nprint after middle node");
		head=list.middle(head);
		list.traverse(head);
		
		
		
		
	}
	
}

Output: 1 2 3 4 
	print mid node value
	3

	print after middle node
	3 4 
