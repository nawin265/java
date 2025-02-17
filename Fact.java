class Fact
{
public static void main(String args[])
	{
int num=2,start=1,fact=1,sum=0;
       for(;start<=num;start++)
           {
           fact=fact*start;
 	    sum=sum+fact;
           }
        System.out.println(fact+" "+sum);
     }
}
