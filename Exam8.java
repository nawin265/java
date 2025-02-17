class Exan
{
public static void main(String args[])
	{
         int num=132,sum=0,pro=0,temp=num;
           for(;num!=0;num=num/10)
              {
              int rem=num%10;
                sum=sum+rem;
               }
                num=temp;
                for(;num!=0;num=num/10)
              {
              int rem=num%10;
                pro=pro*rem;
               }
              if(sum==pro)
                 System.out.prinln(temp+"power number");