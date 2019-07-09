package bihaoran.coding;
/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * @author bihaoran
 *
 */
public class VerifySquenceOfBST {
	
	/**
	 * 
		由题意可得：
		1. 后序遍历序列的最后一个元素为二叉树的根节点；
		2. 二叉搜索树左子树上所有的结点均小于根结点、右子树所有的结点均大于根结点。
		
		算法步骤如下：
		1. 找到根结点；
		2. 遍历序列，找到第一个大于等于根结点的元素i，则i左侧为左子树、i右侧为右子树；
		3. 我们已经知道i左侧所有元素均小于根结点，那么再依次遍历右侧，看是否所有元素均大于根结点；若出现小于根结点的元素，则直接返回false；若右侧全都大于根结点，则：
		4. 分别递归判断左/右子序列是否为后序序列；
	 */
	 public boolean VerifySquenceOfBST(int [] sequence) {
		 if(sequence==null||sequence.length<=0)
		 {
			 return false;
		 }
		 return VerifySquenceOfBST(0,sequence.length-1,sequence);
		 
	 }

	private boolean VerifySquenceOfBST(int start, int end, int[] sequence) {
		if(start==end)
		{
			return true;
		}
		int i=start;
		int root=sequence[end];
		while(sequence[i]<root)
		{
			i++;
		}
		int j=i;
		while(j<end)
		{
			if(sequence[j]<root)
			{
				return false;
			}
			j++;
		}
		
		
		return VerifySquenceOfBST(start,j-1,sequence)&&VerifySquenceOfBST(j,end,sequence);
	}
}

