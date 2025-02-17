class Cquse15
{
public static void main(String args[])
	{
         int num=5,temp=num,count=0,rev=0,start=1;
          for(;num!=0;num=num/10)
	     {
              int rem=num%10;
               rev=rev*10+rem;
               }
              System.out.println(rev);
               num=temp;
            for(;start<=num;start++)
                {
                 if(num%start==0)
                     count++;
                  }
               if(temp==rev && count==2)
                System.out.println(temp+"is a palanidrom prime ");
                else
                 System.out.println(temp+"is not a palanidrom prime ");
 	}
}                   