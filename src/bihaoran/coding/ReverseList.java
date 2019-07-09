package bihaoran.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*class ListNode{
	int val;
	ListNode next;
	public ListNode(int data) {
		// TODO Auto-generated constructor stub
		this.val=data;
	}
}*/
public class ReverseList {
	public ListNode reverseList(ListNode head)
	/*{
		 Stack<Integer> stack=new Stack<Integer>();
        if(head==null)
        {
            return null;
        }
		
		while(head!=null)
		{
			stack.push(head.val);
			head=head.next;
		}
		ListNode head1=new ListNode(stack.pop());
		ListNode cur=head1;
		while(!stack.isEmpty())
		{
			ListNode node=new ListNode(stack.pop());
			cur.next=node;	
			cur=node;
		}
		
		return head1;
	}*/
	{
		ListNode next=null;
		ListNode pre=null;//记得赋值
		while(head!=null)
		{
			next=head.next;//收尾相连的
			head.next=pre;
			pre=head;
			head=next;
			
		}
		return pre;
		
	}
}
