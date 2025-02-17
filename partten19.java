class partten19
{
public static void main(String []args)
	{
         int rows=5;
         for( int r=1;r<=rows;r++)
            {
          for(int z=1;z<=r;z++)
             {
             System.out.print("  ");
               }
            for(int c=rows;c>=r;c--)
		{
             if(r==1||r==c||c==rows)
              System.out.print("$ ");
              else 
               System.out.print("  ");
                }
                System.out.println();
                }
               
             }
}
            