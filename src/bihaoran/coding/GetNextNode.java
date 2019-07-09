package bihaoran.coding;

public class TreeNodes
{
	int val;
	TreeNodes left;
	TreeNodes right;
	TreeNodes parent;
	public TreeNodes(int data) {
		// TODO Auto-generated constructor stub
		this.val=data;
	}
}
/**
 * 
 * @author bihaoran
 *给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针
 *
 *如果此节点有右孩子，返回此节点右孩子的最左子节点
 *如果此节点没有右孩子，判断此节点是不是他父节点的左孩子，如果是返回父节点，如果不是此节点和他的父节点都往上窜，直到符合此节点是他父节点的左孩子，返回父节点
 *边界问题 最后一个节点没有后续节点，对应情况为父节点最终为空
 */
public class GetNextNode {
	public TreeNodes GetNext(TreeNodes pNode)
	{
		if(pNode==null)
		{
			return pNode;
		}
		if(pNode.right!=null)
		{
			return getLeftMost(pNode.right);
		}
		else
		{
			TreeNodes parent=pNode.parent;
			while(parent!=null&&pNode!=parent.left)
			{
				pNode=parent;
				parent=pNode.parent;	
			}
			return parent;
			
		}
		
	}

	public TreeNodes getLeftMost(TreeNodes node) {
		if(node==null)
		{
			return node;
		}
		while(node.left!=null)
		{
			node=node.left;
		}
		return node;
	}

}
