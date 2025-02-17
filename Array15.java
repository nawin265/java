class Array15
{
public static void main(String args[])
	{
         int a[][]=new int[][]{{1,2,3,5,9},{4,5,8,6,5},{7,8,6,5,9},{2,5,7,6,8},{1,2,3,4,5}};
                 
               for(int r=0;r<=a.length-1;r++)
                  {
                   for(int c=0;c<=a[r].length-1;c++)
                       {
                         if(r==c||r+c==a.length-1)
                            {
                               System.out.print(a[r][c]+"  ");
                             }
                            else
                              System.out.print("  ");
                        }
                     System.out.println();
                  }
	}
}
                  
         
            