package bihaoran.coding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Print {
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> arrayList=new ArrayList<>();
		ArrayList<Integer> list=new ArrayList<>();
		Queue<TreeNode> queue=new LinkedList<>();
		if(pRoot==null)
		{
			return arrayList;
		}
		TreeNode l=null;
		TreeNode r=null;
		queue.add(pRoot);
		int now=1,next=0;
		while(!queue.isEmpty())
		{
			pRoot=queue.poll();
			now--;
			list.add(pRoot.val);
			l=pRoot.left;
			r=pRoot.right;
			if(l!=null)
			{
				queue.add(l);
				next++;
			}
			if(r!=null)
			{
				queue.add(r);
				next++;
			}
			if(now==0)
			{
				arrayList.add(new ArrayList<Integer>(list));
				now=next;
				next=0;
				list.clear();
			}
		}
		return arrayList;

	
	}
}
