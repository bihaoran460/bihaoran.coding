package bihaoran.coding;

public class InversePairs {
	public int InversePairs(int [] array) {
		int count=0;
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		InversePairs ip=new InversePairs();
		int[] arr= {1,2,3,4,5,6,7,6};
		System.out.println(ip.InversePairs(arr));
	}
}
