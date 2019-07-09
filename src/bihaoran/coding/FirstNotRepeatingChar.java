package bihaoran.coding;

import java.rmi.server.SocketSecurityException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FirstNotRepeatingChar {
	public int FirstNotRepeatingChar(String str) 
	 {
		char[] ch=str.toCharArray();
		int[] arr=new int[200];
		int [] s=new int[200];
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<ch.length;i++)
		{
			int val=ch[i]-'0';
			arr[val]++;
			map.put(i, arr[val]);
		}
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		int j=0;
		while(it.hasNext())
		{
			Integer key=it.next();
			if(map.get(key)==1)
			{		
				s[j++]=key;
			}
		}
		Arrays.sort(s);
		int value=arr[s[0]];
		return value; 
	 }
	 public static void main(String[] args) {
		String s="abcaABC";
		char[] ch=s.toCharArray();
		int[] arr=new int[200];
		int [] s1=new int[200];
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<ch.length;i++)
		{
			int val=ch[i]-'0';
			arr[val]++;
			map.put(arr[val],i);
		}
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		int j=0;
		while(it.hasNext())
		{
			Integer key=it.next();
			System.out.println(key+":"+map.get(key));
		}
		
		
	}

}
