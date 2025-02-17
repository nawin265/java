class Cquse10
{
public static void main(String []args)
	{
	  int num=371,temp=num,power=0,count=0,sum=0;
	for(;num!=0;num=num/10)
	  {
	   int rem=num%10;
	     count++;
           }
           System.out.println(count);
       	   num=temp;
	for(;num!=0;num=num/10)
           {
            int rem=num%10;
	    power=(int)Math.pow(rem,count);
             sum=sum+power;
	   }
            if(temp==sum)
         System.out.println( temp+"is a amstrong ");
	 else
         System.out.println( temp+"is not a amstrong");
	}
} 