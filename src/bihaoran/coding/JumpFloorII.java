package bihaoran.coding;

public class JumpFloorII {
	 public int JumpFloorII(int target)
	 {
		 if(target==1)
			 return 1;
		return 2*JumpFloorII(target-1);
		 
	 }
	 public int JumpFloorIII(int target)
	 {
		 if(target==1)
			 return 1;
		 int count=1;
		 for(int i=1;i<target;i++)
		 {
			 count=count*2;
		 }
		return target;
		 
	 }
}
