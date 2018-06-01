import java.util.Map;
import java.util.HashMap;

public class CopyListWithRandomPointer138 {
	
	

	public static void main(String[] args){
		
	}
	class RandomListNode {
 	    int label;
 	    RandomListNode next, random;
 	    RandomListNode(int x) { this.label = x; }
 	}
 	public RandomListNode copyRandomList(RandomListNode head){
 		// Hashmap
 		if(head == null){
 			return null;
 		}

 		Map<RandomListNode, RandomListNode> map = new HashMap<>();

 		// loop1. copy all nodes.
 		RandomListNode node = head;
 		while(node != null){
 			map.put(node, new RandomListNode(node.label));
 			node = node.next;
 		}
 		// loop2. assgin next and random pointers
 		node = head;
 		while(node != null){
 			map.get(node).next = map.get(node.next);
 			map.get(node).random = map.get(node.random);
 			node = node.next;
 		}
 		return map.get(head);
 	}
 	// iterate, no extra space
 	public RandomListNode copyRandomList1(RandomListNode head){
 		RandomListNode iter = head, next;
 		// make copy each node, and link them together in a single list.
 		while(iter != null){
 			next = iter.next;

 			RandomListNode copy = new RandomListNode(iter.label);
 			iter.next = copy;
 			copy.next = next;

 			iter = next;
 		}

 		// assign random pointer for each copy node.
 		iter = head;
 		while(iter != null){
 			if(iter.random != null){
 				iter.next.random = iter.random.next;
 			}
 			iter = iter.next.next;
 		}
 		// restore original list, and extract copy list.
 		iter = head;
 		RandomListNode pseudoHead = new RandomListNode(0);
 		RandomListNode copy, copyIter = pseudoHead;

 		while(iter != null){
 			next = iter.next.next;

 			//extract copy
 			copy = iter.next;
 			copyIter.next = copy;
 			copyIter = copy;

 			// restore original list
 			iter.next = next;

 			iter = next;
 		}
 		return pseudoHead.next;
 	}
}