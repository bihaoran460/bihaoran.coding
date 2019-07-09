package bihaoran.coding;

/**
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,
 * 要求输出循环左移3位后的结果即“XYZdefabc”。是不是很简单？OK，搞定它！
 * @author bihaoran
 *
 */
public class LeftRotateString {
	 public String LeftRotateString(String str,int n) {
		 if("".equals(str))
		 {
			 return str;
		 }
		 String s1=str.substring(n);//从第n个字符串开始截取，直到最后（从0开始计数）
		 String s2=str.substring(0, n);//从start(这里是0)开始截取，截取的个数为end-start(这里是n-0)
		 String s3=s1+s2;
		return s3;
		 
	 }

}
