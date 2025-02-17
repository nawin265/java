class Tprime
{
public static void main(String args[])
{
for(int i=1;i<=100;i++)
{
    int num=i,count=0,start=1,temp=num,rev=0,count1=0;
    for(;start<=num;start++)
       {
        if(num%start==0)
           count++;
       }
      num=temp;
      for(;num!=0;num=num/10)
          {
          int rem=num%10;
              rev=rev*10+rem;
           }
       num=rev;
       start=1;
    for(;start<=num;start++)
       {
        if(num%start==0)
           count1++;
       }
          if(count==2 && count1==2)
             System.out.println(temp+"is a  twisted prime");
          // else
             // System.out.println(temp+"is not a twisted prime");
}
}
}

