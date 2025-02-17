class Array7
{
public static void main(String args[])
	{
         int a[]=new int[]{0,10,0,20,0,30,40};
              int c1=0,c2=0;
                 
               for(int x=0;x<=a.length-1;x++)
                   {
                    if(a[x]==0)
                      {
                       c1++;
                      }
                     else
                      {
                        a[c2]=a[x];
                          c2++;
                       }
                    }
                     for(int x=1;x<=c1;x++)
                         {
                           a[a.length-x]=0;
                          }

                  
                  for(int b:a)
                       {
                         System.out.println(b);
                       }
          }
}