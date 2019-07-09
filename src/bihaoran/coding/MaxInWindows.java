package bihaoran.coding;

import java.util.ArrayList;

public class MaxInWindows {
	public ArrayList<Integer> maxInWindows(int [] num, int size)
	{
		
		ArrayList<Integer> arrayList=new ArrayList<>();
		if(size==0)
		{
			return arrayList;
		}
		for(int i=0;i<=num.length-size;i++)
		{
			int temp=Integer.MIN_VALUE;
			int count=0;
			for(int j=i;count<size;j++)
			{
				if(temp<num[j])
				{
					temp=num[j];
				}
				count++;
			}
			arrayList.add(temp);
		}
		return arrayList;
		
	}
}
