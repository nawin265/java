class Partten11
{
public static void main(String []args)
	{
         int row=5;
         for(int r=1;r<=row;r++)
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
