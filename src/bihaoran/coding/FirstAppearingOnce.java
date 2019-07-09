package bihaoran.coding;

//字符和整数可以自动转换，对应的应该是ascll码表
public class FirstAppearingOnce {
	int[] count=new int[256];
    int index=1;//这里不能为0，index++先执行index=1，再++
	public void Insert(char ch)
    {
		
        if(count[ch]==0)
        {
        	count[ch]=index++;//index用来记录第一次出现的字符ch在整个字符流中的位置
        }else
        {
        	count[ch]=-1;
        }
        
    }
	public char FirstAppearingOnce()
	{
		int temp=Integer.MAX_VALUE;
		char ch='#';
		for(int i=0;i<256;i++)
		{
			if(count[i]!=0&&count[i]!=-1&&count[i]<temp)
			{
				temp=count[i];
				ch=(char)i;
			}
		}
		return ch;
		
		
	}

}
