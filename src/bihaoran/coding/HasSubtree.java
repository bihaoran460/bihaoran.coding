package bihaoran.coding;

public class HasSubtree {
	 public boolean HasSubtree(TreeNode root1,TreeNode root2) 
	 {
		boolean result=false;
		if(root1!=null&&root2!=null)
		{
			if(root1.val==root2.val)
			{
				result=doesTree1HaveTree2(root1,root2);
			}
			if(!result)
			{
				result=doesTree1HaveTree2(root1.left,root2);
			}
			if(!result)
			{
				result=doesTree1HaveTree2(root1.right,root2);
			}
		}
		return result;
		 
	 }

	private boolean doesTree1HaveTree2(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		if(root2==null)
		{
			return true;
		}
		if(root1==null)
		{
			return false;
		}
		if(root1.val!=root2.val)
		{
			return false;
		}
		return doesTree1HaveTree2(root1.left,root2.left)&&doesTree1HaveTree2(root1.right,root2.right);
	}

}
