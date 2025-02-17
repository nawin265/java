class Array12 //  Bubble sort
{
public static void main(String args[])
	{
         int a[]=new int[]{1,2,3,4,5,6,7};
             
             for(int x=0;x<=a.length-1;x++)
                 {
                  for(int y=0;y<=a.length-2-x;y++)
                      {
                          if(a[y]<a[y+1])
                             {
                               int t=a[y];
                                 a[y]=a[y+1];
                                 a[y+1]=t; 
                              }
                       }
                      
                  }
             for(int t:a)
                  System.out.println(t);
               
         }
}