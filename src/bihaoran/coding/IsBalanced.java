package bihaoran.coding;

/**
 * 判断一棵树是不是平衡二叉树
 * @author bihaoran
 *判断左子树是否平衡，判断右子树是否平衡，再求左右子树的高度差
 */
public class IsBalanced {
	private boolean isBalanced=true;
	public boolean isBlanced(TreeNode head)
	{
		getDepth(head);
		return isBalanced;
	}
	public int getDepth(TreeNode head) {
		
		if(head==null)
		{
			return 0;
		}
		int left=getDepth(head.left);
		int right=getDepth(head.left);
		if(Math.abs(left-right)>1)
		{
			isBalanced=false;
		}
		return right>left ?right+1:left+1;
		// TODO Auto-generated method stub
		
	}

}
