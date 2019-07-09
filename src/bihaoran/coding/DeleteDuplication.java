package bihaoran.coding;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 *  例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * @author bihaoran
 *
 */
public class DeleteDuplication {
	public ListNode deleteDuplication(ListNode pHead)
	{
		ListNode head=new ListNode(0);
		head.next=pHead;		
		ListNode cur1=head;
		ListNode cur2=cur1.next;
		while(cur2!=null)
		{
			if(cur2.next!=null&&cur2.val==cur2.next.val)
			{
				while(cur2.next!=null&&cur2.val==cur2.next.val)
				{
					cur2=cur2.next;
				}
				cur1.next=cur2.next;
				cur2=cur2.next;
			}	
			else
			{
				cur1=cur1.next;
				cur2=cur2.next;
			}
			
		}
		return head.next;	
	}

}
