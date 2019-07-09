package bihaoran.coding;

import java.util.ArrayList;
import java.util.List;

/*
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有
 * 的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {
	public void reOrderArray(int [] array) {
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2!=0)
			{
				list1.add(array[i]);
			}
			else
			{
				list2.add(array[i]);
			}
		}
		int j=0;
		for(Integer value:list1)
		{
			array[j++]=value;
		}
		for(Integer value:list2)
		{
			array[j++]=value;
		}
		
	}

}
