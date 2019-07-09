package bihaoran.coding;

import java.util.ArrayList;

public class PrintMatrix {
	ArrayList<Integer> list=new ArrayList<>();
	public ArrayList<Integer> printMatrix(int [][] matrix)
	{
		int tc=0,tr=0,dc=matrix[0].length-1,dr=matrix.length-1;
		while(tc<=dc&&tr<=dr)
		{
			printMatrix(matrix,tc++,tr++,dc--,dr--);
		}
		return list;
	}

	private void printMatrix(int[][] matrix, int tc, int tr, int dc, int dr) {
		if(tc==dc)//只有一列
		{
			for(int i=tr;i<=dr;i++)
			{
				list.add(matrix[i][tc]);
				
			}
		}else if(tr==dr)
		{
			for(int i=tc;i<=dc;i++)
			{
				list.add(matrix[tr][i]);
			}
		}
		else
		{
			for(int i=tc;i<dc;i++)
			{
				list.add(matrix[tr][i]);
			}
			for(int i=tr;i<dr;i++)
			{
				list.add(matrix[i][dc]);
				
			}
			for(int i=dc;i>tc;i--)
			{
				list.add(matrix[dr][i]);
			}
			for(int i=dr;i>tr;i--)
			{
				list.add(matrix[i][tc]);
			}
		}	
	}
	public static void main(String[] args) {
		PrintMatrix a=new PrintMatrix();
		int[][] arr= {{1,2,3,4},{5,6,7,8}};
		ArrayList<Integer> list=a.printMatrix(arr);
		for(Integer i:list)
		{
			System.out.print(i+" ");
		}
		
		
	}

}
