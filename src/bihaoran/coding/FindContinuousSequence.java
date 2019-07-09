package bihaoran.coding;

import java.util.ArrayList;

public class FindContinuousSequence {
	/**
	 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
	 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
	 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
	 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
	 */
	/*public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		int sum1=0,i=1,j=1;
		boolean flag=true;
		while(flag)
		{
			while(sum1!=sum)
			{
				sum1=0;
				i=j;
				while(sum1<sum)
				{
					sum1+=i;
					i++;
				}
				j++;
				if(j>=sum)
				{
					flag=false;
					break;
				}
			}
			ArrayList<Integer> list1=new ArrayList<>();
			if(j<sum)
			{
				for(int start=j-1;start<i;start++)
				{
					list1.add(start);
				}
			}
			if(!list1.isEmpty())
			{
				list.add(list1);
			}
			sum1=0;
		}
		return list;	
	}*/
	/**
	 * 双指针，先利用数列是等差数列求出和，再用求出的和去和要求的值比较，相同则把该范围内的数放入集合内，比它小则快指针想右移，比它大则慢指针向右移
	 * @param sum
	 * @return
	 */
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		int plow=1,phigh=2;
		while(plow<phigh)
		{
			int sum1=(plow+phigh)*(phigh-plow+1)/2;
			if(sum1==sum)
			{
				ArrayList<Integer> list1=new ArrayList<>();
				for(int start=plow;start<=phigh;start++)
				{
					list1.add(start);
				}
				list.add(list1);
				plow++;
			}
			else if(sum1<sum)
			{
				phigh++;
			}
			else
			{
				plow++;
			}		
		}
		return list;
	}
	public static void main(String[] args) {
		int sum=100;
		FindContinuousSequence t=new FindContinuousSequence();
		ArrayList<ArrayList<Integer>> list=t.FindContinuousSequence(sum);
		System.out.println(list.size());
		
	}
}
