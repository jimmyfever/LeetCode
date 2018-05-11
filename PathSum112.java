
public class PathSum112 {
	
	

	public static void main(String[] args){
		
	}
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}	
	public boolean pathSum(TreeNode root, int sum){
		if(root==null) {
			return false;
		}

		if(root.left==null && root.right==null && sum-root.val==0){
			return true;
		}

		return pathSum(root.left,sum-root.val) || pathSum(root.right,sum-root.val);
	}		
}