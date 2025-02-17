class plian
{
public static void main(String args[])
{

        for(int i=1;i<=100;i++)
	{
      int num=i,rev=0,temp=num;
       for(;num!=0;num=num/10)
           {
             int rem=num%10;
               rev=rev*10+rem;
           }
             		
             if(temp==rev)
              System.out.println(temp+"is a palindron");
}
}
}

