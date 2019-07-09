package bihaoran.coding;

/**
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，
 * 但却读不懂它的意思。例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
 * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 * @author bihaoran
 *
 */
public class ReverseSentence {
	  public String ReverseSentence(String str) {
		char[] s=str.toCharArray();
		StringBuffer s1=new StringBuffer();
		int j=s.length-1;
		for(int i=s.length-1;i>=0;i--)
		{
			if(s[i]==' ')
			{
				reverse(s,i+1,j);
				j=i-1;
			}
		}
		reverse(s,0,j);
		for(int i=0;i<s.length;i++)
		{
			s1.append(s[i]);
		}
		s1.reverse();
		str=s1.toString();
		return str; 
	  }
	private void reverse(char[] s, int i, int j) {
		while(i<j)
		{
			char temp=s[i];
			s[i++]=s[j];
			s[j--]=temp;
		}
		
	}
	public static void main(String[] args) {
		ReverseSentence a=new ReverseSentence();
		String str=a.ReverseSentence("student. a am I");
		System.out.println(str);
		
	}
	 

}
