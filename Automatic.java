class Automatic
{
public static void main(String args[])
	{
        int num=76,num1=num*num,count1=0,count2=0,num2=0,rev=0,temp=num;
               System.out.println(num+" num");
                System.out.println(num1+" squre of number");
                
            for(;num!=0;num=num/10)
                {
                 int rem=num%10;
                   count1++;
                }
                 
                
                for(;num1!=0;num1=num1/10)
                    {
                     int rem=num1%10;
                         count2++;
                          num2=num2*10+rem;
                       if(count1==count2)
                           {
                            break;
                            }
                    }
                       
                    for(;num2!=0;num2=num2/10)
                        {
                          int rem=num2%10;
                            rev=rev*10+rem;
                         }
                        if(temp==rev)
                         System.out.println(rev+" is a automatic number");
                         else
                            System.out.println(rev+" is not automatic number");
          }
}         