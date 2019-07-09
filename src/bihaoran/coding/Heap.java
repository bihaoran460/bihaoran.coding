package bihaoran.coding;
/*
 * 堆排序三个过程：
 * 首先建立建立堆（这里建立的是大根堆）
 * 把最后一个数和第一个数交换；
 * 把堆的范围缩小，然后调整堆，这样相当于最后一个数被弹出；
 * 
 * 
 */
public class Heap {
	public static void  heapInsert(int [] arr,int index)
	{
		while(arr[index]>arr[(index-1)/2])
		{
			swap(arr,index,(index-1)/2);
			index=(index-1)/2;
		}
	}
	public static void heapify(int[] arr,int index,int heapsize)//堆向下沉的过程
	{
		int left=2*index+1;
		while(left<heapsize)
		{
			int largest=((left+1)<heapsize)&&arr[left+1]>arr[left]?left+1:left;
			largest=arr[largest]>arr[index]?largest:index;
			if(largest==index)
			{
				break;
			}
			swap(arr,largest,index);
			index=largest;
			left=2*index+1;
		}
	}
	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		// TODO Auto-generated method stub	
	}
	public void heapSort(int[] arr)
	{
		if(arr==null||arr.length<2)
		{
			return;
		}
		for(int i=0;i<arr.length;i++)
		{
			heapInsert(arr, i);
		}
		int size=arr.length;
		while(size>0)
		{
			swap(arr,0,size-1);
			heapify(arr, 0, --size);
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
		Heap a=new Heap();
		int[] arr=a.generateArray();
		System.out.print("[");
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[arr.length-1]+"]");
		a.heapSort(arr);
		System.out.println();
		System.out.print("[");
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[arr.length-1]+"]");
	}
}

