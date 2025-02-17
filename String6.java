class String6
{
public static void main(String args[])
	{
         String s="abcd";
          
            for(int x=0;x<=s.length();x++)
                {
                 for(int y=x+1;y<=s.length();y++)
                     {
                         String s2=s.substring(x,y);
                        System.out.println(s2);
                      }
		}
	}
}