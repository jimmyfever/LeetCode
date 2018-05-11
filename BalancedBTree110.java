
public class BalancedBTree110 {
	
	

	public static void main(String[] args){
		
	}	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}	
	public boolean isBalanced(TreeNode root){
		return depth(root) != 1;
	}
	public int depth(TreeNode root){
		if(root==null){
			return 0;
		}
		int left = depth(root.left);
		int right = depth(root.right);
		if(left == -1 || right == -1 || Math.abs(left-right)>1){
			return -1;
		}
		return 1+Math.max(left,right);
	}
}