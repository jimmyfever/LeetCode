
public class DiameterOfBTree543 {
	
	int max = 0;

	public static void main(String[] args){
		
	}
	public class TreeNode {
 	    int val;
 	    TreeNode left;
 	    TreeNode right;
 	    TreeNode(int x) { val = x; }
 	}
	public int diameter(TreeNode root){
		maxDepth(root);
		return max;
	}	
	private int maxDepth(TreeNode root){
		if(root == null) return 0;

		int left = maxDepth(root.left);
		int right = maxDepth(root.right);

		max = Math.max(max, left+right);

		return Math.max(left, right) + 1;
	}
}