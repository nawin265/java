import java.util.Scanner;
class Array1
{
public static void main(String args[])
	{
        int a[]=new int[5];
        Scanner s=new Scanner(System.in);
 for(int x=0;x<=a.length-1;x++)
    {
           a[x]=s.nextInt();
           
     }
System.out.println("---------------------");
  for(int x=0;x<=a.length-1;x++)
      {
       System.out.println(a[x]);
       }

        }
}
