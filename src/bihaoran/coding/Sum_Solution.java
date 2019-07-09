package bihaoran.coding;

/**
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * @author bihaoran
 *
 */
public class Sum_Solution {
	 public int Sum_Solution(int n)
	 {
		int sum=0;
		int a=1;
		boolean flag=((n!=0)&&a==(sum=Sum_Solution(n-1)));
		sum+=n;
		return sum;		 
	 }
	 public static void main(String[] args) {
		Sum_Solution a=new Sum_Solution();
		int value=a.Sum_Solution(4);
		System.out.println(value);
	}

}
