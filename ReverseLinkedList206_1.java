
public class ReverseLinkedList206_1 {
	
	

	public static void main(String[] args){
		
	}
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int val){
			this.val = val;
			this.next = null;
		}
	}

	public ListNode reverse(ListNode head){
		ListNode pre = null;
		while(head != null){
			ListNode tmp = head.next;
			head.next = pre;
			pre = head;
			head = tmp;
		}
		return pre;
	}	
}