class Nestprime
{
public static void main(String args[])
	{
         for(int i=1;i<=100;i++)
          {
	   
             int num=i,start=1,count=0;
             for(;start<=num;start++)
                {
                if(num%start==0)
                 count++;
                 }
              if(count==2)
                System.out.println(num+ " is a prime");
		}
	}
}

             