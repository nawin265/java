class Evil
{
public static void main(String args[])
	{
          int num=9,sum=0;
          int num2=num*num;
              for(;num2!=0;num2/=10)
                  {
                   int rem=num2%10;
                  sum=sum+rem;
                   }
                  if(num==sum)
                     System.out.println(num +" super number ");
      }  
}