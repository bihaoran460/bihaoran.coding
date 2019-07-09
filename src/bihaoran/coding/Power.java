package bihaoran.coding;
/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * @author bihaoran
 *
 */
public class Power {
	 public double Power(double base, int exponent) {
		double val=1;
		if(base==0)
		{
			return 0;
		}
		if(exponent==0)
		{
			return 1;
		}
		if(exponent>0)
		{
			for(int i=0;i<exponent;i++)
			{
				val=val*base;
			}
			return val;
		}
		if(exponent<0)
		{
			for(int i=0;i<exponent;i++)
			{
				val=val*(1/base);
			}
			return val;
		}
		return val;
		 
	 }

}
