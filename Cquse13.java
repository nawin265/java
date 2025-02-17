class Cquse13
{
public static void  main(String args[])
	{
         int num=555,temp=num,rev=0;
        for(;num!=0;num=num/10)
          {
           int rem=num%10;
            rev=rev*10+rem;
  	  }
                  System.out.println( rev+"of number ");
          if(temp==rev)
           System.out.println(temp+" is a palanidrom ");   
  	    else
                System.out.println( temp+" not is a palanidrom "); 	
	}
}