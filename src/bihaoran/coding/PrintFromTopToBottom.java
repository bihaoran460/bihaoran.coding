package bihaoran.coding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 利用队列 进行层序遍历；
 * @author bihaoran
 *
 */
public class PrintFromTopToBottom {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root)
	{
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		if(root==null)
        {
            return arrayList;
        }
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(root);
		TreeNode l=null;
		TreeNode r=null;
		while(!queue.isEmpty())
		{
			root=queue.poll();
			arrayList.add(root.val);
			l=root.left;
			r=root.right;
			if(l!=null)
			{
				queue.add(l);
			}
			if(r!=null)
			{
				queue.add(r);
			}	
			
		}
		return arrayList;
		
	}

}
