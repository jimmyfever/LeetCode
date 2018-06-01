import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class CloneGraph133 {
	
	

	public static void main(String[] args){
		
	}
	class UndirectedGraphNode {
	    int label;
	    List<UndirectedGraphNode> neighbors;
	    UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
	}
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
		if(node == null){
			return null;
		}

		UndirectedGraphNode newNode = new UndirectedGraphNode(node.label); // new node
		HashMap<Integer, UndirectedGraphNode> map = new HashMap<>();	// store visited nodes
		map.put(newNode.label, newNode); // add first node to hashmap

		LinkedList<UndirectedGraphNode> queue = new LinkedList<>();	// store original nodes need to be visited
		queue.add(node); // add first original node to queue

		while(!queue.isEmpty()){	// if more nodes need to be visited
			UndirectedGraphNode n = queue.pop();	//search first node in queue
			for(UndirectedGraphNode neighbor : n.neighbors){
				if(!map.containsKey(neighbor.label)){	//add to map and queue if this node hasn't been searched before
					map.put(neighbor.label, new UndirectedGraphNode(neighbor.label));
					queue.add(neighbor);
				}
				map.get(n.label).neighbors.add(map.get(neighbor.label)); // add neighbor to new nodes
			}
		}
		return newNode;
	}	
}