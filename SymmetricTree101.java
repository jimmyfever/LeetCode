
public class SymmetricTree101 {
	
	// Constructor
	public SymmetricTree101(){
		
	}

	public static void main(String[] args){
		
	}
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public static boolean isSym(TreeNode root){
		return root == null || Helper(root.left, root.right);
	}
	public static boolean Helper(TreeNode left, TreeNode right){
		if(left==null || right==null){
			return left==right; //if both null return true, else false.
		}
		if(left.val != right.val){
			return false;
		}
		return Helper(left.left, right.right) && Helper(left.right,right.left);
		}

	
}