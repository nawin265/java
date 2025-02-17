class Cquse11
{
public static void main(String []args)
	{
  		int num=125689,count=0,power=0,sum=0,rem=0;
	    for(;num!=0;num=num/10)
             {
                rem=num%10;
		count++;
		if(count%2==0)
		//power=(int)Math.pow(rem,count);
                 sum=sum+rem;
              }
	   System.out.println(sum);
	}
}