package bihaoran.coding;

/*class ListNode{
	int val;
	ListNode next;
	public ListNode(int data) {
		// TODO Auto-generated constructor stub
		this.val=data;
	}
}*/
public class RemoveLastKthNode {
	public ListNode removeLastKthNode(ListNode head,int k)
	{
		if(head==null||k<1)
		{
			return head;
		}
		ListNode cur=head;
		while(cur!=null)
		{
			k--;
			cur=cur.next;
		}
		if(k==0)
		{
			head=head.next;
		}
		else if(k<0)
		{
			cur=head;
			while(++k!=0)//这一行
			{
				cur=cur.next;	
			}
			cur.next=cur.next.next;
		}
		return head;
		
	}

}
