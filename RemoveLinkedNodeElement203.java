
public class RemoveLinkedNodeElement203 {
	
	

	public static void main(String[] args){

	}	
	public static class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public static ListNode removeElement(ListNode head, int val){
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		head = dummy;		// add a head(-1) to listnode head
		while(head.next != null){
			if(head.next.val == val){
				head.next = head.next.next;
			}else{
				head = head.next;
			}
		}
		return dummy.next;
	}
}
