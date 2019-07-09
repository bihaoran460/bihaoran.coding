package bihaoran.coding;

import java.util.Stack;

public class Convert {
	 public TreeNode Convert(TreeNode pRootOfTree)
	 {
		 if(pRootOfTree==null)
		 {
			 return null;
		 }
		 TreeNode p=pRootOfTree;
		 TreeNode pre=null;
		 boolean isFirst=true;
		 if(p!=null)
		 {
			Stack<TreeNode> stack= new Stack<TreeNode>();
			while(!stack.isEmpty()||p!=null)
			{
				if(p!=null)
				{
					stack.push(p);
					p=p.left;
				}
				else
				{
					p=stack.pop();
					if(isFirst==true)
					{
						pRootOfTree=p;
						pre=pRootOfTree;
						isFirst=false;
					}
					else
					{
						pre.right=p;
						p.left=pre;
						pre=p;				
					}
					p=p.right;	
				}
			}		
		}
		 return pRootOfTree;
		 
	 }

}
