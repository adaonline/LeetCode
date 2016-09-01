/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
       if(head==null||head.next==null){
	    		return head;
	    	}
	    	ListNode copy=new ListNode(0);
	    	ListNode temp=null;
	    	ListNode p=null;
	    	copy.next=head;
	    	temp=head.next;
	    
	    	head.next=null;
	    	while(temp!=null){
	    		p=temp;
	    		temp=temp.next;
	    		p.next=copy.next;
	    		copy.next=p;
	    	
	    		
	    	}
			return copy.next;
	        
    }
}