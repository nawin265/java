class Cquse12
{
public static void main(String []args)
	{
           int num=231678,num1=0,max=9;
         for(;num!=0;num=num/10)
	   {
            int rem=num%10;
             num1=rem;
            if(num1<max)
             max=num1;
 	    }
          System.out.println( max+" is a least ");
	}
} 