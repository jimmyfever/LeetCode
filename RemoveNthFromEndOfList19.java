
public class RemoveNthFromEndOfList19 {
	
	

	public static void main(String[] args){
		
	}
	public class ListNode {
 	    int val;
 	    ListNode next;
 	    ListNode(int x) { val = x; }
 	}
 	public ListNode removeNthFromEnd(ListNode head, int n){
 		if(n <= 0){
 			return null;
 		}

 		ListNode dummy = new ListNode(0);
 		dummy.next = dummy;

 		ListNode preDel = dummy;
 		for(int i = 0; i < n; i++){
 			if(head == null){
 				return null;
 			}
 			head = head.next;
 		}
 		while(head != null){
 			head = head.next;
 			preDel = preDel.next;
 		}
 		preDel.next = preDel.next.next;
 		return dummy.next;
 	}		
}