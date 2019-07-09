package bihaoran.coding;

public class Multiply {
	public int[] multiply(int[] A) 
	{
		int n=A.length;
		int[] B=new int[n];
		for(int i=0;i<n;i++)
		{
			int temp=A[i];
			A[i]=1;
			B[i]=1;
			for(int j=0;j<n;j++)
			{
				B[i]*=A[j];
			}
			A[i]=temp;
		}
		return B;
		
	}
}
