import java.util.HashSet;

public class TwoSumIV653 {
	
	

	public static void main(String[] args){
		
	}	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public boolean findTarget(TreeNode root, int k){
		HashSet<Integer> set = new HashSet<Integer>();
		return dfs(root, set, k);
	}
	public boolean dfs(TreeNode root, HashSet<Integer> set, int k){
		if(root==null) return false;
		if(set.contains(k-root.val)) return true;
		set.add(root.val);
		return dfs(root.left, set, k) || dfs(root.right, set, k);
	}
}