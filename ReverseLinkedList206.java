
public class ReverseLinkedList206 {
	
	

	public static void main(String[] args){
		
	}
	public class ListNode {
      	int val;
      	ListNode next;
      	ListNode(int x) { val = x; }
  	}
  	public ListNode reverse(ListNode head){
  		ListNode pre = null;
  		ListNode curr = head;
  		while(curr != null){
  			ListNode next = curr.next;
  			curr.next = pre;
  			pre = curr;
  			curr = next;
  		}
  		return pre;
  	}	

  	public ListNode reverse1(ListNode head){
  		if(head==null || head.next==null){
  			return head;
  		}
  		ListNode rest = reverse1(head.next);
  		head.next.next = head; // put head in the last position
  		head.next = null; // remove the rest of head
  		return rest;
  	}
}