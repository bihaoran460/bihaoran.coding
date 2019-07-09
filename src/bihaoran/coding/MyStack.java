package bihaoran.coding;

import java.util.Stack;
/*
 * 
 * 
 *
 */
public class MyStack {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	public MyStack() {
		this.stackData=new Stack<Integer>();
		this.stackMin=new Stack<Integer>();
	}
	public void push(int newNum)
	{
		if(stackMin.isEmpty())
		{
			stackMin.push(newNum);
		}
		else if(stackMin.peek()>=newNum)
		{
			stackMin.push(newNum);
		}
		stackData.push(newNum);
		
	}
	public int pop()
	{
		if(stackData.isEmpty())
		{
			throw new RuntimeException("Your stack is empty");
		}
		int value=stackData.pop();
		if(value==stackMin.peek())
		{
			stackMin.pop();
		}
		return value;
	}
	public int getMin()
	{
		if(stackMin.isEmpty())
		{
			throw new RuntimeException("Your stackMin is empty");
		}
		else
		{
			return stackMin.peek();
		}
	}

}
