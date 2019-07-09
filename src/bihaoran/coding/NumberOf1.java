package bihaoran.coding;

/**
 * 
 * @author bihaoran

 *
 */
public class NumberOf1 {
	 public int NumberOf1(int n) {
		 int count=0;
		 char[] ch=Integer.toBinaryString(n).toCharArray();
		 for(int i=0;i<ch.length;i++)
		 {
			 if(ch[i]=='1')
			 {
				 count++;
			 }
		 }
		 return count;
		 

	    }
	
}
