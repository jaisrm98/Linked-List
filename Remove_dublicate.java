package Linklist;

public class Remove_dublicate {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}

	}

	void remove_duplicates() {
		Node ptr1 = head;
		Node ptr2 = null;
		while (ptr1.next != null && ptr1 != null) {
			ptr2 = ptr1;
			while (ptr2.next != null) {
				if (ptr1.data == ptr2.next.data)
					ptr2.next = ptr2.next.next;
				else
					ptr2 = ptr2.next;
			}

			ptr1 = ptr1.next;
		}
	}

	void add(int data) {
		Node first = new Node(data);

		first.next = head;
		head = first;
	}

	void traverse(Node n) {
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String args[]) {
		Remove_dublicate list = new Remove_dublicate();
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(1);
		Node four = new Node(1);
		list.head.next = second;
		second.next = third;
		third.next = four;
		list.traverse(head);
		System.out.println();
		list.remove_duplicates();
		list.traverse(head);
	}

}

Output: 1 2 1 1 
	1 2 
