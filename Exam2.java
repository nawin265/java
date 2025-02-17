import java.util.Scanner;
class Exam2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
   int a=s.nextInt();
   int b=s.nextInt();
    int c=0,start=1,end=10;
    
      while(start<=end)
	{
         c=a+b;
         a=b;
         b=c;
   	System.out.println("a="+a);
        start++;
       }
}
}       	