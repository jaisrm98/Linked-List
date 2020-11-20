package Linklist;

public class Palindrome {
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
	Node reverse(Node n)
	{
		Node prev=null;
		Node next=null;
		Node curr=n;
		
		while(curr!=null )
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		n=prev;
		return n;
	}
	 boolean isPalindrome(Node n)
	 {
		 n=head;
		 if(n==null)
			 return true;
		 Node rev=reverse(n);
		 while(n!=null)
		 {
			 if(n.data!=rev.data)
				return false;
			 rev=rev.next;
			 n=n.next;
		 }
		 
		 return true;
		
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
		Palindrome list=new Palindrome();
		list.head=new Node(3);
		Node second=new Node(2);
		Node third=new Node(3 );
		list.head.next=second;
		second.next=third;
		list.traverse(head);
		System.out.println();
		
		boolean k=list.isPalindrome(head);
		if(!k)
			System.out.println("Linked list is Not Palindrome");
		else
			System.out.println("Linked list is Palindrome");

			
		
	}
}
