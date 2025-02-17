class Eprime
{
public static void main(String args[])
   {
      int count1=0,count2=0;
    for(int x=1;x<=50;x++)
        {
          int num=x;
         for(int start=1;start<=num;start++)
            {
             if(num%start==0)
                 count1++;
             }
            if(count1==2)
	    {
              System.out.println(num+"is a prime");
              count2++;
            }
            if(count2==10)
               break;
       }
   }
}
