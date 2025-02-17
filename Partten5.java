class Partten5
{
public static void main(String args[])
    {
 int row=5,col=5;
    for(int r=1;r<=row;r++)
        {
         for(int c=1;c<=col;c++)
            {
             if(r==c)
            System.out.print("# ");
             else
             System.out.print("- ");
             }
           System.out.println();
        }
    }
}