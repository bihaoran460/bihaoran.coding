package bihaoran.coding;
/*
 * 
 * 归并排序，多写几次！！
 */
public class MergeSort {
	public static void mergeSort(int arr[])
	{
		if(arr==null||arr.length<2)
		{
			return;
		}
		mergeSort(arr,0,arr.length-1);
	}
	private static void mergeSort(int[] arr, int l, int r) {
		if(l==r)
		{
			return;
		}
		int mid=(l+r)/2;
		mergeSort(arr, l, mid);
		mergeSort(arr,mid+1,r);
		merge(arr,l,mid,r);
		// TODO Auto-generated method stub
		
	}
	private static void merge(int[] arr, int l, int mid, int r) {
		int[] help=new int[r-l+1];
		int p=l,q=mid+1,i=0;
		while(p<=mid&&q<=r)
		{
			help[i++]=arr[p]<arr[q]?arr[p++]:arr[q++];
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
		
	}
	public static void main(String[] args) {
		int[] arr= {11,1,52,36,9,2,4,53};
		MergeSort.mergeSort(arr);
		System.out.print("[");
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[arr.length-1]+"]");
			
	}



}
