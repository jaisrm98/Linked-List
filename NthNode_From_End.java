package Linklist;

public class NthNode_From_End {
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
	void find(int k)
	{ Node n=head;
		boolean t=false;
		int c=1;
		while(n!=null)
		{
			if(c==k)
			{
				System.out.println(n.data);
				t=true;
				break;
			}
			n=n.next;
			c++;
			
		}
		if(!t)
			System.out.println("node does not exist");
	}
	Node reverse(Node n)
	{
		Node curr=n;
		Node next=null;
		Node prev=null;
		
		while(curr!=null)
		{   next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		n=prev;
		return n;
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
		NthNode_From_End list=new NthNode_From_End();
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		list.traverse(head);
		head=list.reverse(head);
		System.out.println();
		list.find(2);
	}
	
}