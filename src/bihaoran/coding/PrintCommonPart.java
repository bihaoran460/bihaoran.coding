package bihaoran.coding;

/*
 * 打印两个链表的公共部分
 */
/*class ListNode{
	int val;
	ListNode next;
	public ListNode(int data) {
		// TODO Auto-generated constructor stub
		this.val=data;
	}
	
}*/
public class PrintCommonPart {
	public void printCommonPart(ListNode head1,ListNode head2)
	{
		while(head1!=null&&head2!=null)
		{
			if(head1.val>head2.val)
			{
				head2=head2.next;
			}
			else if(head1.val<head2.val)
			{
				head1=head1.next;
			}
			else
			{
				System.out.println(head1.val);
				head1=head1.next;
				head2=head2.next;
			}
		}
	}
}
