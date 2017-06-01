package src.leetcode.LinkedLists;

import src.leetcode.LinkedLists.AddTwoLists.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/*
 * Find mid, reverse 2nd half of the list, compare both half's, if all values match, return true, else return false.
 * Alternatively, you could use a stack to push all values and traverse again to pop values from stack and compare.
 * */
public class LinkedListPalindrome {
	
	public static void main(String[] args){
		int[] arr = {1,1,2,1};
		ListNode start = new ListNode(0);
		ListNode head = start;
		for(int i=0;i<arr.length;i++){
			start.next = new ListNode(arr[i]);
			start = start.next;
		}
		System.out.println(isPalindrome(head.next));
	}
    public static boolean isPalindrome(ListNode head) {
        if(head==null || head.next == null) return true;
        int size = 0, tcount = 0;
        ListNode st = head;
        while(st!=null){
        	size++;
        	st = st.next;
        }
        System.out.println("LinkedList size is "+size+" and mid is "+size/2);
        ListNode st1 = head;
        while(tcount != size/2){
        	System.out.println("val is "+st1.val);
        	st1 = st1.next;
        	tcount++;
        }
        ListNode temp = st1;
        ListNode n1 = null, n2 = null;
        while(temp!=null){
            n1 = temp.next;
            temp.next = n2;
            n2 = temp;
            temp = n1;
        }
        
        while(head!=null && n2!=null){
            if(head.val!=n2.val)
                return false;
            head = head.next;
            n2 = n2.next;
        }
        
        return true;
        
    }
}