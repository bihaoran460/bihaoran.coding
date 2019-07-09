package bihaoran.coding;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

/**
 * 二叉树的序列化（记录成字符串格式）和反序列化（根据字符串格式重建二叉树）
 * @author bihaoran
 *
 */
public class SerializeAndDeserializeOfBinaryTree {
	public String Serialize(TreeNode root)
	{
		if(root==null)
		{
			return "#!";
		}
		String res=root.val+"!";
		res+=Serialize(root.left);
		res+=Serialize(root.right);
		return res;
			
	}
	public TreeNode Deserialize(String res) 
	{
		String[] value=res.split("!");
		Queue<String> queue=new LinkedList<String>();
		for(int i=0;i<value.length;i++)
		{
			queue.add(value[i]);
			
		}
		
		return reconPreOrder(queue);
		
	}
	public TreeNode reconPreOrder(Queue<String> queue) {
		// TODO Auto-generated method stub
		String value=queue.poll();
		if(value.equals("#"))
		{
			return null;
		}
		TreeNode head=new TreeNode(Integer.valueOf(value));
		head.left=reconPreOrder(queue);
		head.right=reconPreOrder(queue);
		
		return head;
	}

}
