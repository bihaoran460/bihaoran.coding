package bihaoran.coding;
/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
 * 超过数组长度的一半，因此输出2。如果不存在则输出0。
 * @author bihaoran
 *
 */
public class MoreThanHalfNum {
	public int MoreThanHalfNum_Solution(int [] array) {
		int len=array.length;
		int max=-99999;
		double value=len/2;
		int[] arr=new int [99999];
		for(int i=0;i<len;i++)
		{
			arr[array[i]]++;
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		for(int i=0;i<=max;i++)
		{
			if(arr[i]>value)
			{
				return i;
			}
		}
		return 0;
		
	}

}
