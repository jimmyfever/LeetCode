import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {
	
	

	public static void main(String[] args){
		
	}
	class DirectedGraphNode {
 	    int label;
 	    ArrayList<DirectedGraphNode> neighbors;
 	    DirectedGraphNode(int x) { label = x; neighbors = new ArrayList<DirectedGraphNode>(); }
 	}	
 	public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph){
 		ArrayList<DirectedGraphNode> res = new ArrayList<>();
 		HashMap<DirectedGraphNode, Integer> map = new HashMap<>();
 		for(DirectedGraphNode node : graph){
 			for(DirectedGraphNode neighbor : node.neighbors){
 				if(map.containsKey(neighbor)){
 					map.put(neighbor, map.get(neighbor) + 1);
 				}else{
 					map.put(neighbor, 1);
 				}
 			}
 		}

 		Queue<DirectedGraphNode> queue = new LinkedList<DirectedGraphNode>();
 		for(DirectedGraphNode node : graph){
 			if(!map.containsKey(node)){
 				queue.offer(node);
 				res.add(node);
 			}
 		}
 		while(!queue.isEmpty()){
 			DirectedGraphNode node = queue.poll();
 			for(DirectedGraphNode n : node.neighbors){
 				map.put(n, map.get(n) - 1);
 				if(map.get(n) == 0){	// in-degree is 0
 					res.add(n);
 					queue.offer(n);
 				}
 			}
 		}
 		return res;
 	}
}