class Array11 // swaping of elements
{
public static void main(String args[])
	{
         int a[]=new int[]{10,20,30,40,50,60};
                
                
                 for(int x=0;x<=a.length-1;x++)
                      {
                        if(x%2==0)
                           {
                            for(int y=x+1; y<=a.length-1;y++)
                               {
                            int temp=a[x];
                                 a[x]=a[y];
                                  a[y]=temp;
                                     break;
                                }
                           
                           }
		
                       }  
                     
                      for(int t:a)
                          System.out.println(t);
           }
}