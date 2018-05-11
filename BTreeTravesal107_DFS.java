import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;


public class BTreeTravesal107_DFS {
	
	public static void main(String[] args){
		
	}
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}	
	public List<List<Integer>> travesal(TreeNode root){
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		List<List<Integer>> result = new ArrayList<>();
		if(root==null){
			return result;
		}
		queue.offer(root);
		while(!queue.isEmpty()){
			int size = queue.size();
			List<Integer> level = new ArrayList<>();
			for(int i=0; i<size; i++){
				TreeNode head = queue.poll();
				level.add(head.val);
				if(head.left != null){
					queue.offer(head.left);
				}
				if(head.right != null){
					queue.offer(head.right);
				}
			}
			result.add(level);
		}
		Collections.reverse(result);
		return result;
	}		
}