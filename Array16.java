
class Main
{
	public static void main(String args[])
	{
       int a[]={5,8,3,9,2,1,9,3,1,2};
         
        int max=0,min=9,sum=0;
         
        for(int x=0;x<=a.length-1;x++)
           {
              if(max<a[x])
                {
                  max=a[x];
                }
              if(min>a[x])
                {
                 min=a[x];
                }
           } 
         System.out.println(max+" and "+min);

        
        for(int x=0;x<=a.length-1;x++)
           {
            
           if(a[x]!=max && a[x]!=min)
              {
               
               sum=sum+a[x];

              }
           }
      System.out.println(sum);
	}
}
         