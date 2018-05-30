
public class LinkedListCycleII142 {
	
	

	public static void main(String[] args){
		
	}
	public class ListNode {
 	    int val;
 	    ListNode next;
 	    ListNode(int x) { val = x; }
 	}
 	public ListNode detectCycle(ListNode head){
 		if(head == null || head.next == null){
 			return null;
 		}

 		ListNode slow, fast;
 		slow = head;
 		fast = head.next;
 		while(fast != slow){
 			if(fast == null || fast.next == null){
 				return null;
 			}
 			fast = fast.next.next;
 			slow = slow.next;
 		}
 		while(head != slow.next){
 			head = head.next;
 			slow = slow.next;
 		}
 		return head;
 	}			
}