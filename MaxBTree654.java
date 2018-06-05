import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;


public class MaxBTree654 {
	
	

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public TreeNode constructMaxBTree(int[] nums){
		Deque<TreeNode> stack = new LinkedList<>();
		for(int i = 0; i < nums.length; i++){
			TreeNode cur = new TreeNode(nums[i]);
			while(!stack.isEmpty() && stack.peek().val < nums[i]){
				cur.left = stack.pop();
			}
			if(!stack.isEmpty()){
				stack.peek().right = cur;
			}
			stack.push(cur);
		}
		return stack.isEmpty() ? null : stack.removeLast();
	}	
}