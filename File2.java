class File2
{
public static void main(String args[])
{
 int num=4523,rem=0,count=0,sum=0,pro=1,sum2=0,start=1,count2=0;
        for(;num!=0;num=num/10)
	  {
             rem=num%10;
             count++;
           if(count==1 || count==4)
                sum=sum+rem;//
             else
              pro=pro*rem;//6
             }
             sum2=sum+pro;
            System.out.println(sum2+" is the sum");
           num=sum2;
           for(;start<=num;start++)
              {
               if(num%start==0)
                count2++;
               
               }
       if(count2==2)
          System.out.println(num+" is a prime");
             
          else
             System.out.println(num+" is not a prime");
}
}