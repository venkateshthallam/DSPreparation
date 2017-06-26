package src.leetcode.Arrays;

public class MergeKSortedLists {
	
	static class ListNode{
		int val;
		ListNode next;
		ListNode(){
			
		}
		ListNode(int val){
			this.val = val;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

    public ListNode mergeKLists(ListNode[] lists) {
        return mergeListsImpl(lists, 0, lists.length-1);
    }
    
    private ListNode mergeListsImpl(ListNode[] lists, int start, int end){
        ListNode res = null;
        if(start < end){
        int mid = (start + end)/2;
        ListNode list1 =  mergeListsImpl(lists, start, mid);
        ListNode list2  = mergeListsImpl(lists, mid+1,end);
        res = merge(list1, list2);
        }
        return res;
    }
    
    private ListNode merge(ListNode list1, ListNode list2){
        if(list1==null) return list2;
        else if(list2==null) return list1;
        ListNode temp = new ListNode();
        ListNode res = temp;
        ListNode node = null;
        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                node = new ListNode(list1.val);
                list1 = list1.next;
            }else{
                 node = new ListNode(list2.val);
                list1 = list2.next;
            }
              temp.next = node;
              temp = temp.next;
        }
        
        while(list1!=null){
             node = new ListNode(list1.val);
             list1 = list1.next;
             temp.next = node;
             temp = temp.next;
        }
        while(list2!=null){
             node = new ListNode(list2.val);
             list2 = list2.next;
             temp.next = node;
             temp = temp.next;
        }
        
        return res.next;
    }


}
