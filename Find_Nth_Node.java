package Linklist;
public class Find_Nth_Node {
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
	 { boolean t=false;
		 Node n=head;
		 int c=0;
		 while(n!=null)
		 {
			 if(k==n.data)
			 {
				 System.out.println(k+" found at index "+c);
				 t=true;
				 break;
			 }
			n=n.next;
			c++;
		 }
		 if(!t)
			 System.out.println(k+" not Found");
		 
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
		Find_Nth_Node list=new Find_Nth_Node();
		list.add(3);
		list.add(2);
		list.add(1);
		list.traverse(head);
		System.out.println();
		list.find(2);
	}
}

Output: 1 2 3 
	2 found at index 1
