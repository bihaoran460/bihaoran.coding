package bihaoran.coding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintZ {
	 public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot)
	 {
	 	ArrayList<ArrayList<Integer>> arrayList=new ArrayList<>();
		ArrayList<Integer> list=new ArrayList<>();
		int flag=1;
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
				if(flag%2==0)
				{
					ArrayList<Integer> list1=new ArrayList<Integer>();
					for(int i=list.size()-1;i>=0;i--)
					{
						list1.add(list.get(i));
					}
					list=new ArrayList<Integer>(list1);
				}
				arrayList.add(new ArrayList<Integer>(list));
				now=next;
				next=0;
				list.clear();
				flag++;
			}
		}
		return arrayList;
	
	}
}
