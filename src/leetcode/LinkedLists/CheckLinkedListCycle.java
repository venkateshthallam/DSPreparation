package src.leetcode.LinkedLists;

import src.leetcode.LinkedLists.AddTwoLists.ListNode;
/*
 * 1. Use two temp nodes, a walker and runner pointing to consecutive nodes.
 * 2. If the node values matches for walker and runner, then there's a cycle.
 * 
 * */
public class CheckLinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode walker = head, runner = head;
        while(runner.next!=null && runner.next.next!=null){
            walker = walker.next;
            runner = runner.next.next;
            if(walker.val==runner.val){
                return true;
            }
        }
        
        return false;
    }

}
