package LinkedListCycleCheck;

public class Node {

	int data;
	Node next;
	Node head;
	Node slow = head;
	Node fast = head.next.next;
	
	Node(int d) {
		data = d;
		next = null;
	}
	
}

