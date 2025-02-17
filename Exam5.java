import java.util.Scanner;
class Exam5
{
public static void main(String args[])
	{
        Scanner s=new Scanner(System.in);
          int num=s.nextInt();
          int rev=0,temp=num; 
          for(;num!=0;)
		{
                 int rem=num%10;
                    rev=rev*10+rem;
		   num=num/10;
                  }
                 if(temp==rev)
                 System.out.println(temp+" is a palindrome");
                  else
                   System.out.println(temp+" is not a palindrome");
	}
}