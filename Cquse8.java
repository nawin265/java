class Cquse8
{
public static void main(String args[])
	{
	  int num=265,res=0;
	double sum=0,temp=num,count=0,power=0;
		while(num!=0)
		{
		res=num%10;
                System.out.println(res);
	    power=Math.pow(res,3);
                sum=sum+res;
		 count++;
                 num=num/10;
                }
		System.out.println(temp+" sum is "+sum);
		System.out.println(temp+" count of "+count);
                System.out.println(power);

	}       
}
		
