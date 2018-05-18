
public class ConvertBSTtoGreaterTree538 {
	
	

	public static void main(String[] args){
		
	}	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public TreeNode convert(TreeNode root){
		int sum = 0;
		if(root == null) return null;

		convert(root.right);

		sum += root.val;
		root.val = sum;

		convert(root.left);

		return root;
	}
}