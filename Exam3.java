import java.util.Scanner;
class Exam3
{
public static void main(String args[])
	{
        Scanner s=new Scanner(System.in);
           int num=s.nextInt();
           int start=1,count=0;
           for(;start<=num;start++)
              {
		if(num%start==0)
  		   count++;
               }
             if(count==2)
             System.out.println(num+" is a prime");
             else
             System.out.println(num+"not a prime");

	}
}