package src.leetcode.LinkedLists;

import java.util.ArrayList;
import java.util.Arrays;

public class AddTwoLists {

	public static void main(String[] args) {
		ListNode list1Head = populateList(new ArrayList<Integer>(Arrays.asList(2,4,3)));
		ListNode list2Head = populateList(new ArrayList<Integer>(Arrays.asList(5,6,4)));
		ListNode res = addTwoNumbers(list1Head,list2Head);
		while(res.next!=null){
			System.out.println(res.val);
			res = res.next;
		}
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
	private static ListNode populateList(ArrayList<Integer> list){
		ListNode head = null, temp = null;
		int val = 0;
		while(list.iterator().hasNext()){
			if(head==null){
				val = list.iterator().next();
				head = new ListNode(val);
			}
			else{
				temp = head;
				while(temp.next!=null){
					temp = temp.next;
				}
				temp.next = new ListNode(list.iterator().next());
			}
		}
		
		return head;
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode res = null, headRes = null;
		int tempRem = 0, sum = 0, carry = 0;
		while (l1 != null && l2 != null) {
			sum = l1.val + l2.val;
			tempRem = sum >= 10 ? sum / 10 : tempRem;
			carry = sum >= 10 ? sum % 10 : carry;
			if (res == null) {
				if (sum >= 10) {
					res = new ListNode(carry);
					headRes = res;
				} else {
					if (tempRem != 0) {
						res = new ListNode(sum + tempRem);
						tempRem = 0;
						headRes = res;
					}
				}
			} else {
				if (sum >= 10) {
					res = new ListNode(carry);
					res = res.next;
				} else {
					if (tempRem != 0) {
						res = new ListNode(sum + tempRem);
						tempRem = 0;
						res = res.next;
					} else {
						res = new ListNode(sum);
						res = res.next;
					}
				}
			}
			l1 = l1.next;
			l2 = l2.next;
		}
		if (tempRem != 0) {
			res.next = new ListNode(tempRem);
			res = res.next;
		}
		return headRes;
	}
}