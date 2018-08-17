package LinkedListCycleCheck;

public class LinkedList {
	
	static Node head;
	
	boolean hascycle()
	{
		Node slow = head;
		Node fast = head.next.next;
		if(head == null)
			return false;
		
		while(fast != null && slow != null)
		{
			if(fast == slow)
			{
				//System.out.println("Loop Prsent");
			  return true;
			}
		     
		   slow = slow.next;
		    fast = fast.next;
		}
		return false;
		
	}
	
	void printList(Node head) 
	{
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String args[])
	
	{
		LinkedList list = new LinkedList();
		list.head = new Node(10);
		list.head.next = new Node(20);
		list.head.next.next = new Node(30);
		list.head.next.next.next = new Node(40);
		list.head.next.next.next.next = new Node(50);
		
		head.next = head.next.next.next.next;
		list.hascycle();
		System.out.println("Linked List after removing loop : ");
		list.printList(head);
	}
}
