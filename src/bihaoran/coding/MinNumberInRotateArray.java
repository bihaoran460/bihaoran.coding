package bihaoran.coding;

public class MinNumberInRotateArray {
	public int minNumberInRotateArray(int[] array)
	{
		int value=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i+1]<array[i])
			{
				value=array[i+1];
				break;
			}
			
		}
		return value;
	}
}
