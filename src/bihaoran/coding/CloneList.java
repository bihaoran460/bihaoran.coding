package bihaoran.coding;

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class CloneList {
	 public RandomListNode Clone(RandomListNode pHead)
	 {
		 if(pHead==null)
		 {
			 return pHead;
		 }
		 RandomListNode pCur=pHead;
		//复制next 如原来是A->B->C 变成A->A'->B->B'->C->C'
		 while(pCur!=null)
		 {
			 RandomListNode node=new RandomListNode(pCur.label);
			 node.next=pCur.next;
			 pCur.next=node;
			 pCur=node.next;
		 }
		 pCur=pHead;
		//复制random pCur是原来链表的结点 pCur.next是复制pCur的结点,pCur.random.next和pCur.random是一样的，因为前面复制了一份，所以这是新链表的random
		 while(pCur!=null)
		 {
			 if(pCur.random!=null)
			 {
				 pCur.next.random=pCur.random.next;
			 }
			 pCur=pCur.next.next;
		 }
		 pCur=pHead;
		 RandomListNode head=pCur.next;
		 RandomListNode cur=head;
		 while(pCur!=null)
		 {
			 pCur.next=pCur.next.next;
			 if(cur.next!=null)
			 {
				 cur.next=cur.next.next;
			 }
			 pCur=pCur.next;
			 cur=cur.next;
			 
		 }
		return head;
		 
	 }

}
