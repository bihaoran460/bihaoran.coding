package bihaoran.coding;


/*class ListNode{
	int val;
	ListNode next;
	public ListNode(int data) {
		// TODO Auto-generated constructor stub
		this.val=data;
	}
}*/
/**
 * 每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。HF作为牛客的资深元老,自然也准备了一些小游戏。
 * 其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。每次喊到m-1的那个小朋友
 * 要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,
 * 可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
 * @author bihaoran
 *
 */
/**
 * 建立链表成环再去执行相应的逻辑
 * @author bihaoran
 *
 */
public class LastRemaining {
	public int LastRemaining_Solution1(int n, int m) {
		ListNode head=new ListNode(0);
		ListNode cur=head;
		for(int i=1;i<n;i++)
		{
			ListNode list=new ListNode(i);
			cur.next=list;
			cur=list;	
		}
		cur.next=head;
		if(m==1)
		{
			return cur.val;
		}
		int count=1;
		ListNode cur1=head;
		ListNode cur2=head.next;
		while(cur1.next!=cur1)
		{	
			if(count==m-1)
			{
				cur1.next=cur2.next;
				cur2=cur2.next;
				count=0;
			}else {
				cur1=cur1.next;
				cur2=cur2.next;
				count++;
			}	
		}
		
		return cur1.val;
		
	}
	public int LastRemaining_Solution(int n, int m) {
		int[] arr=new int[n];
		int value=n,count=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=1;
		}
		while(value!=1)
		{	
			for(int j=0;j<n;j++)
			{
				if(arr[j]==0)
				{
					continue;
				}
				if(count==m-1)
				{
					arr[j]=0;
					count=-1;
					value--;
				}
				if(value==1)
				{
					break;
				}
				count++;
			}
		}
		for(int k=0;k<n;k++)
		{
			if(arr[k]==1)
			{
				return k;
			}
		}
		return 0;	
	}
	
	public static void main(String[] args) {
		LastRemaining a=new LastRemaining();
		int value=a.LastRemaining_Solution1(6, 1);
		System.out.println(value);
		
	}
}
