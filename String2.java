class String2  // max vowels in an string
{
public static void main(String args[])
	{
         String s="a quick brown fox jumps over a lazy dog";
             String a[]=s.split(" ");
                 int max=0;
                  String res="";
          
               for(int x=0;x<=a.length-1;x++)
                   {
                    String s2=a[x];
                       int count=0;
                     for(int y=0;y<s2.length();y++)
                         {
                            char c=s2.charAt(y);
                            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                               {
                                 count++;
                               }
                           }
                           System.out.println(s2+" "+count);
 
                    // for max count elements  
                      -----------------------
                             if(max<=count)
                                {
                                 max=count;
                                 res=s2;

                    //for all max count elements
                     ----------------------------
                                 if(max==count)
                                    {
                                     res=res+s2+" ";
                                 
                                     }
                                   else
                                     {
                                      res=s2+" ";
                                      max=count;
                                     }
                                }
                   }
              System.out.println(max+" max vowels is "+res);
	}
}
