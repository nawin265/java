class Partten8
{
public static void main(String args[])
    {
 int row=14,col=14;
    for(int r=1;r<=row;r++)
        {
         for(int c=1;c<=col;c++)
            {
             if(r==c||r+c==row+1)
            System.out.print("# ");
             else if(r==1|| r==row||c==1||c==col)
             System.out.print("# ");
              else
              System.out.print("  ");
             }
           System.out.println();
        }
    }
}