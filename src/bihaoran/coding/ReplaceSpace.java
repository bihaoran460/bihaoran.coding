package bihaoran.coding;

public class ReplaceSpace {
	public String replaceSpace(StringBuffer str)
	{
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c==' ')
			{
				str.replace(i,i+1, "%20");//���һ���ַ��滻����ַ� ��ôԭ�ַ����ᱻ����
			}
		}
		String s=str.toString();
		return s;	
	}
	public static void main(String[] args) {
		ReplaceSpace rs=new ReplaceSpace();
		StringBuffer str1=new StringBuffer("We Are Happy");
		String s=rs.replaceSpace(str1);
		System.out.println(s);
	}

}
