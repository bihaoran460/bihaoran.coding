package bihaoran.coding;

import java.util.ArrayList;
import java.util.Collections;

public class GetMedian {
	 ArrayList<Integer> arrayList=new ArrayList<>();
	 int flag=0;
	 public void Insert(Integer num) {
		 arrayList.add(num);
		 if(arrayList.size()%2==0)
		 {
			 flag=0;
		 }else
		 {
			 flag=1;
		 }
		 
	 }

	 public Double GetMedian() {
		 double value;
		 Collections.sort(arrayList);
		 if(flag==1)
		 {
			value=arrayList.get(arrayList.size()/2);
		 }else
		 {
			 value=(arrayList.get(arrayList.size()/2)+arrayList.get(arrayList.size()/2-1));
			 value=value/2;//不能直接在上一行代码除以2，因为会自动转为整数（int/int类型）再转成double类型
		 }
		return value;
	        
	 }


}
