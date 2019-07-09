package bihaoran.coding;

public class TreeDepth {
	 public int TreeDepth(TreeNode root) {
	        if(root==null)
			{
				return 0;
			}
			int hl=TreeDepth(root.left);
			int hr=TreeDepth(root.right);
			return hl>hr?hl+1:hr+1;
	    }
}
