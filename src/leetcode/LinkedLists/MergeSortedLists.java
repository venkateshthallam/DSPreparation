package src.leetcode.LinkedLists;

/*
 * 1. Loop through both the lists and check if both are not null, add the smaller value to the resultant list.
 * 2. After the first exit, check for either of the lists are not null, append values to resultant list and return it.
 * */
public class MergeSortedLists {
	
	public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	
	public static void main(String[] args) {
		ListNode l1 = null;
		ListNode l2 = new ListNode(0);
		
	}
	
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode head = res;
        while(l1!=null && l2!=null){
            if(l1.val <= l2.val){
                res.next = new ListNode(l1.val);
                res = res.next;
                 l1 = l1.next;
            }else if(l1.val > l2.val){
                res.next = new ListNode(l2.val);
                res = res.next;
                l2 = l2.next;
            }
           
          
        }
        while(l1!=null){
            res.next = new ListNode(l1.val);
            res = res.next;
            l1 = l1.next;
        }
        while(l2!=null){
            res.next = new ListNode(l2.val);
            res = res.next;
            l2 = l2.next;
        }
        
        return head.next;
    }
}