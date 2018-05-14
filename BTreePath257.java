import java.util.List;
import java.util.ArrayList;


public class BTreePath257 {
	
	

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}	
	public List<String> bTreePaths(TreeNode root){
		List<String> paths = new ArrayList<>();
		if(root == null){
			return paths;
		}

		List<String> leftPaths = bTreePaths(root.left);
		List<String> rightPaths = bTreePaths(root.right);
		for(String path : leftPaths){
			paths.add(root.val + "->" + path);
		}
		for(String path : rightPaths){
			paths.add(root.val + "->" + path);
		}

		if(paths.size() == 0){
			paths.add("" + root.val);
		}

		return paths;

	}
}