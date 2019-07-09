package bihaoran.coding;

public class NetherlandFlag {
	public void partition(int[] arr,int num)
	{
		int less=-1,more=arr.length,cur=0,temp=0;
		while(cur!=more)
		{
			if(arr[cur]<num)
			{
				temp=arr[cur];
				arr[cur]=arr[less+1];
				arr[less+1]=temp;
				less++;
				
			}
			if(arr[cur]>num)
			{
				temp=arr[cur];
				arr[cur]=arr[more-1];
				arr[more-1]=temp;
				more--;
				cur--;
			}
			cur++;
			
		}
	}
	public  int[] generateArray() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		return arr;
	}
	public static void main(String[] args) {
		{
			NetherlandFlag a=new NetherlandFlag();
			int[] arr= a.generateArray();
			a.partition(arr, 50);
			System.out.print("[");
			for(int i=0;i<arr.length-1;i++)
			{
				System.out.print(arr[i]+",");
			}
			System.out.print(arr[arr.length-1]+"]");
		}
		
	}

}
