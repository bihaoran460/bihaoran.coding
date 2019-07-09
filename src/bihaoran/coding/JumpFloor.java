package bihaoran.coding;

public class JumpFloor {
	public int jumpFloor(int target)
	{
		if(target==1)
		{
			return 1;
		}
		if(target==2)
		{
			return 2;
		}
		else
		{
			int first=1,second=2,third=0;
			third=first+second;
			for(int i=0;i<target-3;i++)
			{
				first=second;
				second=third;
				third=first+second;
			}
			return third;
		}
		
	}
	public int jumpFloor1(int target)
	{
		if(target==1)
		{
			return 1;
		}
		if(target==2)
		{
			return 2;
		}
		else 
			return jumpFloor1(target-1)+jumpFloor1(target-2);
	}
	
	public static void main(String[] args) {
		JumpFloor a=new JumpFloor();
		int b=a.jumpFloor1(6);
		System.out.println(b);
		
	}

}
