package Linklist;

public class LinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public void addbegin(int data)
	{
		Node begin=new Node( data);
		
		begin.next=head;
		head=begin;
	}
	public void addend(int data)
	{
		Node last=new Node(data);
		if(head==null)
		{
			head=new Node(data);;
		}
		last.next=null;
		Node k=head;
		while(k.next!=null)
		{
			k=k.next;
		}
		k.next=last;
	}
	public void aftergiven(Node prev,int data)
	{
		Node given=new Node(data);
		given.next=prev.next;
		prev.next=given;
	}
	public void deletenode(int position)
	 {
		 if(head==null)
		 {
			 return;
		 }
		 Node temp=head;
		 if(position==0)
		 {
			 head=temp.next;
		 }
		 for(int i=0;temp!=null &&i<position-1;i++)
		 {
			 temp=temp.next;
		 }
		 if(temp==null || temp.next==null)
			 return;
		 Node next=temp.next.next;
		 temp.next=next;
	 }
	public void search(int k)
	{ boolean t=false;
		Node x=head;
		int c=0;
		while(x!=null)
		{
			if(x.data==k) 
				System.out.println(k+" found at index "+(c));
			t=true;
			x=x.next;
			c++;
			
		}
			if(!t) 
			{
				System.out.println(k+" not found ");
			}
		
	}
	 public void traverse()
	 {
		 int c=0;
		 Node n=head;
		 while(n!=null) {
			 System.out.print(n.data+" ");
			 n=n.next;
			 c++;
		 }
		 System.out.println("\ntotal node "+c);
	 }
	

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.head=new Node(1);
		Node second =new Node(2);
		Node third =new Node(3);
		list.head.next=second;
		second.next=third;
		list.aftergiven(third,5);
		list.addbegin(0);
		list.addend(48);
	
        list.traverse();
        System.out.println("\nlinked list after deletion of node\n");
        list.deletenode(4);
        list.traverse();
        list.search(48);
        }

}
