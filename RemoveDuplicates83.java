
public class RemoveDuplicates83 {
	
	// Constructor
	public RemoveDuplicates83(){
		
	}

	public static void main(String[] args){
		
	}
	public class ListNode {
    int val;
    ListNode next;
    
    public ListNode(int x) {
        val = x;
        next = null;
    }
	}
	public static ListNode removeDuplicates(ListNode head){
		//you always need a pointer to point at the head of the list, 
		//otherwise the whole list will be lost. This is the reason why you need to create a temporary pointer to traverse through the list.
		ListNode tmp = head;

		while(tmp != null && tmp.next != null){
			if(tmp.val == tmp.next.val){
				tmp.next = tmp.next.next;
			}else {
				tmp = tmp.next;
			}
		}
		return head; //Because at the end of the while loop list points to the last element in head -> list = list.next
	}
}