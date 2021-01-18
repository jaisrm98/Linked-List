
public class LinkedList {

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
	
	 void  add(int data)
	{
		Node first=new Node(data);
		first.next=head;
		head=first;
	}
	 void given(Node prev,int data)
	 {
		 Node given=new Node(data);
		given.next=prev.next;
		prev.next=given;
	 }
	 void last(int data)
	 {
	 Node last=new Node(data);
	 Node n=head;
	 if(head==null)
		 head=new Node(data);
	 last.next=null;
	while(n.next!=null)
	{
		n=n.next;
		
	}
	n.next=last;
	 }
	 
	 void del(int pos)
	 {
		 Node n=head;
		 if(pos==0)
			 head=head.next;
		 if(head==null)
			 return;
		 for(int i=0;i<pos-1 && n!=null;i++)
		 {
			n=n.next;
		 }
		 if(n==null || n.next==null)
			 return;
		 n.next=n.next.next;
	 }
	 Node rev()
	 {
		 
		 Node prev=null;
		 Node next=null;
		 Node curr=head;
		 while(curr!=null)
		 {
			 next=curr.next;
			 curr.next = prev;
			 prev=curr;
			 curr=next;
		 }
		 head=prev;
		 return head;
	 }
	 void search(int data)
	 {
		 int c=0;
		 boolean t=false;
		 Node n=head;
	if(head==null)
		return;
	while(n!=null)
	{
		if(n.data==data) {
			System.out.println(data+" found at index"+c);
		t=true;}
		c++;
		n=n.next;
		
	}
	if(!t)
		System.out.println("not found");
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
		LinkedList list=new LinkedList ();
		list.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		list.head.next=second;
		second.next=third;
		list.traverse(head);
		list.given(head, 4);
		System.out.println();
		list.traverse(head);
		list.last(5);
		System.out.println();
		list.traverse(head);
		list.del(4);
		System.out.println();
		list.traverse(head);
		System.out.println();
		list.search(4);
		
		head=list.rev();
		list.traverse(head);
		
	
	}
		
	}
	
	Output: 1 2 3 
		1 4 2 3 
		1 4 2 3 5 
		1 4 2 3 
		4 found at index 1
		3 2 4 1 


