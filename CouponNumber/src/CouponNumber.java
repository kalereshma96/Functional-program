import java.util.Scanner;

public class CouponNumber {
	
	public static int getCoupon(int n)
	{
	   return(int) (Math.random()*n);
		//return n;
	}
	
	public static int collect(int n) {
//		int [] isCollected=new int(n);
		
		boolean[] a = new boolean[n];


		int count=0;
		int distinct=0;
		
		while(distinct<n)
			{
			int value=getCoupon(n);
             count++;	
            if( !a[value])
     
            {
            	distinct++;
            	a[value] = true;
            }
		}
		
		return count;
		
	}
	

	
}
