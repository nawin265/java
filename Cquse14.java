class Cquse14
{
public static void  main(String args[])
	{
         int num=76554,temp=num,rev=0,rev2=0,rem=0;
        for(;num!=0;num=num/10)
          {
           rem=num%10;
            rev=rev*10+rem;
  	  }
                  System.out.println( rev+" of number ");

         for(;rev!=0;rev=rev/10)
	    {
             rem=rev%10;
             rev2=rev2*10+rem;
            }
            System.out.println( rev2+"of number ");
	}
}