public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}

class Reverse_linkedlist_leetcode {
	
	public ListNode reverseList(ListNode head) {
		
		ListNode prev = null;
		while(head != null) 
		{
			ListNode next_node = head.next;
			head.next = prev;
			prev = head;
			head = next_node;
		}
		return prev;
	}
}