import java.util.Scanner;
class Exam1
{
public static void main(String args[]) 
{
    Scanner s=new Scanner (System.in);
      int a=s.nextInt();
      int b=s.nextInt();
       a=a+b;
       b=a-b;
       a=a-b;
       
	System.out.println("a="+a);
         System.out.println("b="+b);
}
}