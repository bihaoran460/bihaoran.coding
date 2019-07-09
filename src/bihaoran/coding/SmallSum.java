package bihaoran.coding;

public class SmallSum {
	public int getSmallSum(int[] arr)
	{
		if(arr==null||arr.length<2)
		{
			return 0;
		}
		return getSmallSum(arr,0,arr.length-1);
		
	}

	private int getSmallSum(int[] arr, int l, int r) {
		if(l==r)
		{
			return 0;
		}
		int mid=(l+r)/2;
		return getSmallSum(arr,l,mid)+getSmallSum(arr,mid+1,r)+merge(arr,l,mid,r);
	}

	private int merge(int[] arr, int l, int mid, int r) {
		int help[]=new int[r-l+1];
		int p=l,q=mid+1,i=0,sum=0;
		while(p<=mid&&q<=r)
		{
			if(arr[p]<=arr[q])
			{
				sum+=arr[p]*(r-q+1);
				help[i++]=arr[p++];
			}
			else
			{
				help[i++]=arr[q++];
			}
		}
		while(p<=mid)
		{
			help[i++]=arr[p++];
		}
		while(q<=r)
		{
			help[i++]=arr[q++];
		}
		for(i=0;i<help.length;i++)
		{
			arr[l+i]=help[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		SmallSum a=new SmallSum();
		int[] arr= {1,3,5,2,4,6};
		int b=a.getSmallSum(arr);
		System.out.println(b);
	}
}
