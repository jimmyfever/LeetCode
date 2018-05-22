
public class TrimBST669 {
	
	

	public static void main(String[] args){
		
	}	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public TreeNode trim(TreeNode root, int L, int R){
		if(root==null) return null;

		if(root.val<L) return trim(root.right, L, R);
		if(root.val>R) return trim(root.left, L, R);

		root.left = trim(root.left, L, R);
		root.right = trim(root.right, L,R);


		return root;
	}
}