class Array10 // deleting of elements
{
public static void main(String args[])
	{
         int a[]=new int[]{1,2,3,4,5};
                int index=2;
                
                 for(int x=index;x<=a.length-2;x++)
                      {
                            a[x]=a[x+1];
                
		
                       } 
                        a[a.length-1]=0; 
                     
                      for(int t:a)
                          System.out.println(t);
           }
}
