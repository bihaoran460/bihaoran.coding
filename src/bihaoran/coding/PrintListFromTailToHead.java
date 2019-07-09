package bihaoran.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class ListNode {
	int val;
    ListNode next = null;
    ListNode(int val) {
    	this.val = val;
      }
    }
public class PrintListFromTailToHead {
	public ArrayList printListFromTailToHead(ListNode listNode)
	{
		Stack<Integer> stack=new Stack<Integer>();
		while(listNode!=null)
		{
			stack.push(listNode.val);
			listNode=listNode.next;
		}
		ArrayList<Integer> arrayList=new ArrayList<>();
		while(!stack.isEmpty())
		{
			arrayList.add(stack.pop());
		}
		return arrayList;
		
		
	}

}
