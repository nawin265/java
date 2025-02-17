class Cquse9
{
public static void main(String args[])
	{
	   int num=123,temp=num;
		double power=0,sum=0;

		while(num!=0)
		{
		  int res=num%10;
		    power=Math.pow(res,3);
		     sum=sum+power;
			num=num/10;
		 }
               if(temp==sum)
               System.out.println( temp+"is a amstrong ");
		else
		System.out.println( temp+"is not a amstrong ");
	}
}