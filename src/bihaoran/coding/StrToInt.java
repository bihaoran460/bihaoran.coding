package bihaoran.coding;

//将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，
//但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
public class StrToInt {
	public int StrToInt(String str) {
		char[] ch=str.toCharArray();
		int sum=0,flag=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{
				sum=sum*10+(ch[i]-48);
			}else if(i==0&&ch[i]=='+')
			{
				flag=0;
			}
			else if(i==0&&ch[i]=='-')
			{
				flag=1;
			}
			else
			{
				return 0;
			}
		}
		if(flag==1)
		{
			sum=sum*(-1);
		}
		return sum;
		
	}
	public static void main(String[] args) {
		StrToInt a=new StrToInt();
		int value=a.StrToInt("0");
		System.out.println(value);
	}
}
