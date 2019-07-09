package bihaoran.coding;

import java.util.Stack;

/*public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int data) {
		this.val=data;
	}
}*/
public class BinaryTree {
	public void preOrderRecur(TreeNode head)
	{
		System.out.println(head.val);
		preOrderRecur(head.left);
		preOrderRecur(head.right);
	}
	public void inOrderRecur(TreeNode head)
	{
		preOrderRecur(head.left);
		System.out.println(head.val);
		preOrderRecur(head.right);
	};
	public void posOrderRecur(TreeNode head)
	{
		preOrderRecur(head.left);
		preOrderRecur(head.right);
		System.out.println(head.val);
		
	};
	/**
	 * 二叉树非递归先序遍历:（中左右）
	 * 0：建立一个栈，
	 * 1:如果头结点不为空，先把头结点压入栈中;
	 * 2:当栈不为空时，弹出顶部节点，打印，
	 * 然后判断该节点的右节点是否为空， 不为空则压入，
	 * 然后判断该节点的左节点是否为空， 不为空则压入，
	 * 退出循环。
	 * 
	 * @param head
	 */
	public void preOrderUnRecur(TreeNode head)
	{
		if(head!=null)
		{
			Stack<TreeNode> stack=new Stack<TreeNode>();
			stack.push(head);
			{
				while(!stack.isEmpty())
				{
					head=stack.pop();
					System.out.println(head.val);
					if(head.right!=null)
					{
						stack.push(head.right);
					}
					if(head.left!=null)
					{
						stack.push(head.left);
					}
					
				}
			}
			
		}
	}
	/**
	 * 二叉树非递归中序遍历：（左中右）
	 * 1：判断头结点是否为空，不为空创建一个栈；
	 * 2：当前结点不为空或栈不为空时开启循环，
	 * 	  如果当前节点不为空，将节点压入栈中，当前节点指向左孩子
	 * 	 当前节点为空，栈不为空时，弹出栈顶元素作为当前节点，打印，当前节点指向右孩子；
	 * @param head
	 */
	public void inOrderUnRecur(TreeNode head)
	{
		if(head!=null)
		{
			Stack<TreeNode> stack= new Stack<TreeNode>();
			while(!stack.isEmpty()||head!=null)
			{
				if(head!=null)
				{
					stack.push(head);
					head=head.left;
				}
				else
				{
					head=stack.pop();
					System.out.println(head.val);
					head=head.right;
				}
			}
			
		}
	}
	/**
	 * 非递归二叉树的后续遍历：
	 * 按先序遍历的方法 构造出中右左（先序）的顺序，放入栈中，最后成为左右中（后续）
	 * @param head
	 */
	public void posOrderUnRecur(TreeNode head)
	{
		if(head!=null)
		{
			Stack<TreeNode> stack1 =new Stack<TreeNode>();
			Stack<TreeNode> stack2 =new Stack<TreeNode>();
			stack1.push(head);
			while(!stack1.isEmpty())
			{
				head=stack1.pop();
				stack2.push(head);
				if(head.left!=null)
				{
					stack1.push(head.left);
				}
				if(head.right!=null)
				{
					stack1.push(head.right);
				}
			}
			while(!stack2.isEmpty())
			{
				System.out.println(stack2.pop());
			}
		}
	}
}
