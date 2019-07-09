package bihaoran.coding;
/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @author bihaoran
 *
 */
public class ReConstructBinaryTree {
	public TreeNode reConstructBinaryTree(int [] pre,int [] in){
		if(pre==null||in==null||pre.length!=in.length)
		{
			return null;
		}
		return construct(pre,0,pre.length-1,in,0,in.length-1);
	}
	/**
	 * 
	 * @param pre   前序遍历
      * @param ps    前序遍历的开始位置
      * @param pe    前序遍历的结束位置
      * @param in    中序遍历
      * @param is    中序遍历的开始位置
      * @param ie    中序遍历的结束位置
      * @return        数的根节点
	 */
	public TreeNode construct(int[] pre, int ps, int pe, int[] in, int is, int ie) {
		// TODO Auto-generated method stub
		if(pe<ps)
		{
			return null;
		}
		TreeNode head=new TreeNode(pre[ps]);
		int index=is;
		while(index<=ie&&in[index]!=pre[ps])
		{
			index++;
		}
		if(index>ie)
		{
			throw new RuntimeException("Invalid Iuput!");
		}
		head.left=construct(pre,ps+1,ps+index-is,in,is,index-1);
		head.right=construct(pre,ps+index-is+1,pe,in,index+1,ie);
		return head;
		
	}
}

