
class Exam5
{
public static void main(String args[])
  {
for(int i=1;i<=1000;i++)
{
int num=i,count=0,rev=0,power=0,sum=0,temp=num;
     for(;num!=0;num=num/10)
       {
         int rem=num%10;
          count++;
       }
      num=temp;
    for(;num!=0;num=num/10)
       {
         int rem=num%10;
          rev=rev*10+rem;
           power=(int)Math.pow(rem,count);    
            sum= sum+power;
       }
        if(temp==sum)
         System.out.println(temp+ " is a amstromg");
        // else
       // System.out.println(temp+ " is not a amstromg");
     }


   }
}