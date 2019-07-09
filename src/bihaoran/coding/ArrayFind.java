package bihaoran.coding;

public class ArrayFind {
	/*public boolean Find(int target, int [][] array)
	{
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			int low=0,high=array[i].length-1;
			while(low<=high)//
			{
				int mid=(low+high)/2;
				if(target>array[i][mid])
				{
					low=mid+1;
				}
				else if(target<array[i][mid])
				{
					high=mid-1;
				}
				else {
					return true;
				}
			}
		}
		return false;
	}*/
	public boolean Find(int target, int [][] array)
	{
		int row=array.length-1,col=0;//
		while(col<array[0].length&&row>=0)
		{
			if(target>array[row][col])
			{
				col++;
			}
			else if(target<array[row][col])
			{
				row--;
			}
			else
			{
				return true;
			}
		}
		return false;
		
	}
}

