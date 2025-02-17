class Partten17
{
public static void main (String []args)
	{
         int row=1;
          for(int r=5;r>=row;r--)
           {
            for(int c=1;c<=r;c++)
            {
            if(c==1||r==c|| r==5)
             System.out.print("# ");
             else
              System.out.print("  ");
             }
             System.out.println();
            }
            row=5;
          for(int r=2;r<=row;r++)
           {
            for(int c=1;c<=r;c++)
            {
             if(c==1||r==row||r==c)
             System.out.print("# ");
              else
              System.out.print("  ");
             }
             System.out.println();
           }
         }
}
