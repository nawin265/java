class Largest
{
public static void main(String args[])
	{
         int num=12948,max=0,smax=0;
         for(;num!=0;num=num/10)
             {
              int rem=num%10;
               if(rem>max)
                 {
                  smax=max;
                  max=rem;
                 }
              else if(rem>smax && rem!=max)
                    {
                      smax=rem;
                     }

             }
    System.out.println(max+" largest num "+smax+" second largest");
	}
}
