class Array3    // assecding and dsending order
{
public static void main(String args[])
	{
         int a[]=new int[]{11,55,12,45,55,85,95,3,1};
           
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
              System.out.println("after sorting");
              for(int x=0;x<=a.length-1;x++)
                  {
                      System.out.println(a[x]);
                   }
	}
}

                