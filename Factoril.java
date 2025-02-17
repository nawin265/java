class Factoril
{
 public static void main(String args[])
	{
        int num=145,sum=0,temp=num;
              for(;num!=0;num=num/10)//14
	     {
              int rem=num%10,start=1,fact=1;
                for(;start<=rem;start++)
                   {
                     fact=fact*start;
		    }  
               
                 sum=sum+fact;
                }
            
          if(temp==sum)
            System.out.println(temp+" is a strong number");
           else
               System.out.println(temp+" is not strong number");
        } 
}