package src.leetcode.LinkedLists;

/*
 * 1. Use two extra pointers.
 * 2. While head is not null, make sure you have 1 pointer to current, previous and next nodes. Traverse change the link direction.
 * */
public class ReverseLinkedList {
	
	static class ListNode{
		int val;
		ListNode next;
		public ListNode(int val){
			this.val = val;
		}
	}

	public static void main(String[] args) {
		
		ListNode node = new ListNode(28);
		ListNode head = node;
		for(int i=5;i>0;i--){
			node.next = new ListNode(5*i);
			node = node.next;
		}
		printList(head);
		ListNode newHead = reverseLinkedList(head);
		System.out.println("After reversal");
		printList(newHead);

	}
	
	private static ListNode reverseLinkedList(ListNode head){
		ListNode n1 = null, n2 = null;
		while(head!=null){
			n1 = head.next;
			head.next = n2;
			n2 = head;
			head = n1;
		}
		
		return n2;
	}
	
	private static void printList(ListNode node){
		ListNode temp = node;
		while(node!=null){
			System.out.println(node.val);
			node = node.next;
		}
	}

}
