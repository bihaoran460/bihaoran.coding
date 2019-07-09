package bihaoran.coding;

import java.util.Stack;

public class IsPopOrder {
	public boolean isPopOrder(int [] pushA,int [] popA) {
		if(pushA.length == 0 || popA.length == 0)
		{
            return false;
		}
		Stack<Integer> stack=new Stack<Integer>();
		int index=0;
		for(int i=0;i<pushA.length;i++)
		{
			stack.push(pushA[i]);
			while(popA[index]==stack.peek()&&!stack.empty())
			{
				stack.pop();
				index++;
				
			}
		}
		
		return stack.empty();	
	}
}
