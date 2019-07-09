package bihaoran.coding;

public class IsSymmetrical {
	boolean isSymmetrical(TreeNode pRoot)
	{
		if(pRoot==null)
			return true;
		return symmetricalBinaryTree(pRoot.left,pRoot.right);
		
	}

	private boolean symmetricalBinaryTree(TreeNode left, TreeNode right) {
		if(left==null&&right==null)
		{
			return true;
		}
		if(left!=null&&right!=null)
		{
			return left.val==right.val&&symmetricalBinaryTree(left.left,right.right)&&symmetricalBinaryTree(left.right,right.left);
		}
		return false;
	}

}
