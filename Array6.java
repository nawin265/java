class Array6 // DECSENDING ORDER AND BINARY SERCH
{
public static void main(String args[])
	{
         int a[]=new int[]{11,55,22,89,25,91,85};
            int serch=25,f=0,l=a.length-1,m;
                
             for(int x=0;x<a.length-1;x++)
                 {
                  for(int c=x+1;c<a.length-1;c++)
                      {
                         if(a[x]<a[c])
                            {
                               int temp=a[x];
                                   a[x]=a[c];
                                    a[c]=temp;
                             
                             }
                       }
                 }
                      System.out.println("ARRAY ELEMENTS ARE ");
                 for(int x=0;x<a.length-1;x++)
                     {
                       System.out.print(a[x]+" ");
                      }
                        
                      for(;f<=l;)
                          {
                             m=(f+l)/2;
                           
                           if(serch==a[m])
                              {
                               System.out.println("\n element found "+serch);
                                 break;
                               }
                              else if(serch>a[m])
                                      l=m+1;
                              else if(serch<a[m])
                                   f=m-1;
                           
                          }
                      if(f>l)
                            System.out.print(serch+" element not found ");
             }
}


------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Array6 // ASENDING IN BINERY SERCH
{
public static void main(String args[])
	{
         int a[]=new int[]{11,55,22,89,25,91,85};
            int serch=25,f=0,l=a.length-1,m;
                
             for(int x=0;x<a.length-1;x++)
                 {
                  for(int c=x+1;c<a.length-1;c++)
                      {
                         if(a[x]>a[c])
                            {
                               int temp=a[x];
                                   a[x]=a[c];
                                    a[c]=temp;
                             
                             }
                       }
                 }
                      System.out.println("ARRAY ELEMENTS ARE ");
                 for(int x=0;x<a.length-1;x++)
                     {
                       System.out.print(a[x]+" ");
                      }
                        
                      for(;f<=l;)
                          {
                             m=(f+l)/2;
                           
                           if(serch==a[m])
                              {
                               System.out.println("\n element found "+serch);
                                 break;
                               }
                              else if(serch>a[m])
                                      f=m+1;
                              else if(serch<a[m])
                                   l=m-1;
                           
                          }
                      if(f>l)
                            System.out.print(serch+" element not found ");
             }
}

