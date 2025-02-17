import java.util.Scanner;
class Array2
{
public static void main(String args[])
	{
        int a[]=new int[5],sum=0;
        Scanner s=new Scanner(System.in);
 for(int x=0;x<=a.length-1;x++)
    {
           a[x]=s.nextInt();
           
     }
System.out.println("---------------------");
  for(int x=0;x<=a.length-1;x++)
      {
        sum=sum+a[x];
       }
       System.out.println(sum);

        }
}
