import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class BTreeLevelOrderTraversal102 {
	
	

	public static void main(String[] args){
		
	}	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public List<List<Integer>> levelOrder(TreeNode root){
		List result = new ArrayList();

		if(root == null){
			return result;
		}

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);

		while(!queue.isEmpty()){
			ArrayList<Integer> level = new ArrayList<>();
			int size = queue.size();	// cannot write into for loop
			for(int i = 0; i < size; i++){
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
		return result;
	}
}