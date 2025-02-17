class Prime
{
public static void main(String args[])
	{
       Demo d1=new Demo();
         int x=2;
        int res=d1.fact1(x);
        System.out.println(x+" factors are "+res);
          if(res==2)
            System.out.println(x+" is a prime ");
         }
}

class Demo 
{
    int fact1(int num)
      {
        int count=0;
       for(int start=1;start<=num;start++)
          {
           if(num%start==0)
             count++;
          }
          return count;
     }
}