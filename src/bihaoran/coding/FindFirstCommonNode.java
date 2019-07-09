package bihaoran.coding;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author bihaoran
 *
 */
public class FindFirstCommonNode {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		if(pHead1==null||pHead2==null)
		{
			return null;
		}
		Set<ListNode> set=new HashSet<>();
		ListNode p1=pHead1;
		while(p1!=null)
		{
			set.add(p1);
			p1=p1.next;
		}
		while(pHead2!=null)
		{
			if(set.contains(pHead2))
			{
				return pHead2;
			}
			pHead2=pHead2.next;
		}
		return null;
	}
	public ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
		if(pHead1==null||pHead2==null)
		{
			return null;
		}
		int len;
		int len1=getlenth(pHead1);
		int len2=getlenth(pHead2);
		if(len1>len2)
		{
			 len=len1-len2;
		}
		else
		{
			len=len2-len1;
		}
		while(len>0)
		{
			if(len1>len2)
			{
				pHead1=pHead1.next;
				len--;
			}
			if(len2>len1)
			{
				pHead2=pHead2.next;
				len--;
			}
		}
		while(pHead1!=null)
		{
			if(pHead1==pHead2)
			{
				return pHead1;
			}
			pHead1=pHead1.next;
			pHead2=pHead2.next;
		}
		return null;
	}
	private int getlenth(ListNode pHead) {
		int lenth=0;
		while(pHead!=null)
		{
			pHead=pHead.next;
			lenth++;
			
		}
		return lenth;
	}
}

