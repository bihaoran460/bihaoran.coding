package bihaoran.coding;

public class QuickSort {
	public void quickSort(int[] arr)
	{
		if(arr==null||arr.length<2)
		{
			return;
		}
		quickSort(arr,0,arr.length-1);
	}

	private void quickSort(int[] arr, int l, int r) {
		if(l<r)
		{
			int[] p=partition(arr,l,r);
			quickSort(arr,l,p[0]-1);
			quickSort(arr, p[1]+1, r);
		}
		// TODO Auto-generated method stub
		
	}

	private int[] partition(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		int less=l-1,more=r;
		int cur=l;
		while(cur<more)
		{
			if(arr[cur]<arr[r])
			{
				swap(arr,less+1,cur);
				less++;		
			}
			else if(arr[cur]>arr[r])
			{
				swap(arr,more-1,cur);
				more--;
				cur--;		
			}
			cur++;
		}
		swap(arr,more,r);
		return new int[]{less+1,more};
	}

	private void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		// TODO Auto-generated method stub	
	}
	public  int[] generateArray() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		return arr;
	}
	public static void main(String[] args) {
		QuickSort a=new QuickSort();
		int[] arr=a.generateArray();
		System.out.print("[");
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[arr.length-1]+"]");
		a.quickSort(arr);
		System.out.println();
		System.out.print("[");
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[arr.length-1]+"]");
	}

}
