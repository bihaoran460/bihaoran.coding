package bihaoran.coding;

public class Partition {
	public void partition(int arr[],int num)
	{
		int p=-1,i=0,temp;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]<num)
			{
				temp=arr[i];
				arr[i]=arr[p+1];
				arr[p+1]=temp;
				p++;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {5,1,2,3,6,8,7,9,4,12,18,16,13,17,14,15};
		Partition a=new Partition();
		a.partition(arr,11);
		System.out.print("[");
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[arr.length-1]+"]");
			
		
	}
	

}
