package bihaoran.coding;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class KthNode {
    public TreeNode KthNode(TreeNode pRoot, int k){
        if(pRoot==null||k==0)
		 {
			 return null;
		 }
		 List<TreeNode> list=new ArrayList<TreeNode>();
		 if(pRoot!=null)
			{
				Stack<TreeNode> stack= new Stack<TreeNode>();
				while(!stack.isEmpty()||pRoot!=null)
				{
					if(pRoot!=null)
					{
						stack.push(pRoot);
						pRoot=pRoot.left;
					}
					else
					{
						pRoot=stack.pop();
						list.add(pRoot);
						pRoot=pRoot.right;
					}
				}
			}
        if(k>list.size())
		 {
			 return null;
		 }
		 TreeNode node =list.get(k-1);
		return node;
    }
    

}