
public class ReverseLinkedListII92 {
	
	

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
	public ListNode reverse(ListNode head, int m, int n){
		if(m >= n || head == null){
			return head;
		}

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		head = dummy;

		// get pre m node, then mNode = head.next;
		for(int i = 1; i < m; i++){
			if(head == null){
				return null;
			}
			head = head.next;
		}

		ListNode premNode = head;
		ListNode mNode = head.next;
		ListNode nNode = mNode, postnNode = mNode.next;

		for(int i = m; i < n; i++){
			if(postnNode == null){
				return null;
			}
			ListNode tmp = postnNode.next;
			postnNode.next = nNode;
			nNode = postnNode;
			postnNode = tmp;
		}
		mNode.next = postnNode;
		premNode.next = nNode;

		return dummy.next;
	}
}