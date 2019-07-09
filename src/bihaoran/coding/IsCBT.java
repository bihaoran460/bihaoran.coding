package bihaoran.coding;

import java.util.LinkedList;
import java.util.Queue;

public class IsCBT {
	public boolean isCBT(TreeNode head)
	{
		boolean leaf=false;
		if(head==null)
		{
			return false;
		}
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		TreeNode l=null;
		TreeNode r=null;
		queue.add(head);
		while(!queue.isEmpty())
		{
			head=queue.poll();
			l=head.left;
			r=head.right;
			if(l==null&&r!=null)
			{
				return false;
			}
			if((r!=null||l!=null)&&leaf)
			{
				return false;
			}
			if(l!=null)
			{
				queue.add(l);
			}
			if(r!=null)
			{
				queue.add(r);
			}
			if(l==null||r==null)
			{
				leaf=true;
			}
		}
		return true;
		
		
	}

}
