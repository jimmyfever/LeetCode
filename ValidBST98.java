
public class ValidBST98 {
	
	private int lastVal = Integer.MIN_VALUE;
	private boolean firstNode = true;

	public static void main(String[] args){
		
	}	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	//inorder
	public boolean isValid(TreeNode root){
		if(root == null){
			return true;
		}

		if(!isValid(root.left)){
			return false;
		}
		if(!firstNode && lastVal >= root.val){
			return false;
		}
		firstNode = false;
		lastVal = root.val;
		if(!isValid(root.right)){
			return false;
		}
		return true;
	}

	// CV
	public boolean isValidBST(TreeNode root){
		return dc(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}
	private boolean dc(TreeNode root, long min, long max){
		if(root == null){
			return false;
		}
		if(root.val <= min || root.val >= max){
			return false;
		}

		return dc(root.left, min, Math.min(max, root.val)) &&
			   dc(root.right, Math.max(min, root.val), max);
	}
}