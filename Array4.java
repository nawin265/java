class Array4  // LARGEST AND SECOND LARGEST 
{
public static void main(String args[])
	{
         int a[]=new int[]{11,55,12,45,55,3,1};
           
              for(int x=0;x<=a.length-2;x++)
                 {
                  for(int c=x+1; c<=a.length-1;c++)
                     {
                      if(a[x]<a[c])
                       {
                        int temp=a[x];
                            a[x]=a[c];
                             a[c]=temp;
                        }
                      }
                  }
              System.out.println("largest number "+a[0]);
              for(int x=1;x<=a.length-1;x++)
                 {
                  if(a[x]!=a[0])
                    {
                         System.out.println(" second largest number "+a[x]);
                          break;
                    }

	         }

             
              
	}
}