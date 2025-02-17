class String7  // dubicates elements in a String
{
public static void main(String args[])
	{
         String s="hello all good morning";
             char c[]=s.toCharArray();
             char d[]=new char[c.length];

              for(int x=0;x<=c.length-1;x++)
                  {
                    int count=0;
                     if(d[x]=='&')
                        {
                          continue;
                        }
                   for(int y=x+1;y<=c.length-1;y++)
                       {
                          if(c[x]==c[y])
                            {
                             count++;
                              
                              d[y]='&';
                            }
                       }
                     if(count>1)
                       {
                       System.out.println(c[x]+" => "+count);

                       }
                    
                  }
	}
}