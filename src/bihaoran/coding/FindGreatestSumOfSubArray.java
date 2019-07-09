package bihaoran.coding;


/**
 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 给一个数组，返回它的最大连续子序列的和，
 * 你会不会被他忽悠住？(子向量的长度至少是1)
 * @author bihaoran
 *
 */
public class FindGreatestSumOfSubArray {
	public int FindGreatestSumOfSubArray(int[] array)
	{
		int max=-99999;
		for(int i=0;i<array.length;i++)
		{
			int val=0;
			for(int j=i;j<array.length;j++)
			{
				val+=array[j];
				if(val>max)
				{
					max=val;
				}
			}
		}
		return max;
		
	}

}
