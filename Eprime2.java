class Eprime2
{
public static void main(String args[])
   {
      int count2=0,stop=15;
    for(int x=1;true;x++)
        {
          int num=x,count1=0;
         for(int start=1;start<=num;start++)
            {
             if(num%start==0)
                 count1++;
             }
            if(count1==2)
	    {
           
              System.out.println(num+"is a prime");
              count2++;
            
            if(count2==stop)
               break; 
            }
       }
   }
}
