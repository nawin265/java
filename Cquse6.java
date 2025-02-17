class Cquse6
{
public static void main(String []args)
	{
	int a=0,b=1,c=0,start=1,end=10;
         System.out.print(a + " ");
		System.out.print(b+" ");
		while(start<=end)
		{
		c=a+b;
		a=b;
		b=c;
		
		System.out.print(c +" ");
			start++;
		}
	}
  }
