package bihaoran.coding;

import java.util.Stack;

public class TwoStacksQueue {
	private Stack<Integer> stack1=new Stack<Integer>();
	private Stack<Integer> stack2=new Stack<Integer>();
	public void push(int node) {
		stack1.push(node);
	}
	public int pop()
	{
		if(stack1.isEmpty()&&stack2.isEmpty())
		{
			throw new RuntimeException("Queue is empty");
		}
		else if(stack2.empty())
		{
			while(!stack1.empty())
			{
				stack2.push(stack1.pop());
			}	
		}
		return stack2.pop();
	}

}
