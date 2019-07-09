package bihaoran.coding;

/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * @author bihaoran
 *设置两个指针，一个一次走一步，一个一次走两步；
 *如果有环，两个指针会相遇，把快指针指向头结点，把速度设为一次走一步，
 *再相遇时，便是环的入口，画图去理解
 */
public class EntryNodeOfLoop {
	public ListNode entryNodeOfLoop(ListNode pHead)
	{
		if(pHead==null||pHead.next==null)
		{
			return null;
		}
		ListNode p1=pHead;
		ListNode p2=pHead;
		while(p2!=null&&p2.next!=null)
		{
			p1=p1.next;
			p2=p2.next.next;
			if(p1==p2)
			{
				p2=pHead;
			}
			while(p1!=p2)
			{
				p1=p1.next;
				p2=p2.next;
			}
			return p1;
		}
		return null;
		
	}

}
