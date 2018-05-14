
public class PalindromeLinkedList234 {
	
	

	public static void main(String[] args){
		
	}	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public boolean isPalindrome(ListNode head){
		ListNode fast = head, slow = head;		//find middle node
		while(fast != null & fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		if(fast != null){	// odd nodes: make right half smaller
			slow = slow.next;
		}
		slow = reverse(slow);
		fast = head;
		
		while(slow != null){
			if(fast.val != slow.val){
				return false;
			}
			fast = fast.next;
			slow = slow.next;
		}
		return true;
	}
	public ListNode reverse(ListNode head){
		ListNode pre = null;
		while(head != null){
			ListNode next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}
}