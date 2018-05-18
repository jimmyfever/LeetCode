
public class BTreeTilt563 {
	int result = 0;
	

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public int tilt(TreeNode root){
		helper(root);
		return result;
	}	
	private int helper(TreeNode root){
		if(root==null) return 0;

		int left = helper(root.left);
		int right = helper(root.right);

		result += Math.abs(left-right);

		return left+right+root.val;
	}
}