class Partten20
{
public static void main(String args[])
	{
         int rows=1;
         for(int r=5;r>=rows;r--)
            {
             for(int c=r;c>=rows;c--)
             {
              if(r==1||r==c||r+c==rows+1)
              System.out.print("# ");
              else
              System.out.print("  ");
             }
             System.out.println();
            }
       
            int row1=5;
         for(int r=2;r<=row1;r++)
            {
             for(int c=1;c<=r;c++)
             {
              System.out.print("# ");
             }
             System.out.println();
            }
       }


}
