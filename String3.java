class String3 // missing alphabets elements in an string  
{
public static void main(String args[])
	{
         String s="a quick brown fox jumps over the lazy dog";
            String  s1=s.toLowerCase();
              char a[]=s1.toCharArray();
                int check=0;
                 for(char x='a';x<='z';x++)
                    {
                      int count=0;
                      for(int y=0;y<a.length;y++)
                         {
                          if(a[y]==x)
                            {
                              count++;
                               break; 
                            }
                         }
                       if(count==0)
                          {
                           check++;
                           System.out.println(x);
                          }

                    }
                 if(check==0)
                    System.out.println("all alphabets are present");
	}
}