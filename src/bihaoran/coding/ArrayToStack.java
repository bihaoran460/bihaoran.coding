package bihaoran.coding;

public class ArrayToStack {
	int[] arr=new int [1000];
	int index=0,i=0;
	public void push(int key)
	{
		arr[i++]=key;
		index=i;
	}
	public int pop()
	{
		index--;
		return arr[index];
	}
	public int peek()
	{
		return arr[index-1];
	}

}
