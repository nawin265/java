class Array14
{
public static void main(String args[])
	{
         int a[][]=new int[][]{{1,2,3,4},{4,3,6,7},{5,6,8,9},{11,1,13,14}};
                 int sum1=0;
               for(int r=0;r<=a.length-1;r++)
                   {
                       int sum=0;
                    for(int c=0;c<=a[r].length-1;c++)
                        {
                          sum=sum+a[r][c]; 
                         }
                       System.out.println(r+"  sum of array  "+sum);

                       sum1=sum1+sum;
                   }
               System.out.println("  sum of array  "+sum1);    
	}
}