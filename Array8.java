class Array8
{
public static void main(String args[])
	{
         int a[]=new int[]{1,2,3,0,2,1,3,8,9};
              int b[]=new int[a.length];
             for(int x=0;x<=a.length-1;x++)
                 {
                  int count=1;
                  if(b[x]==1)
                     {
                      continue;
                      }
                    for(int y=x+1;y<=a.length-1;y++)
                        {
                         if(a[x]==a[y])
                            {
                             count++;
                               b[y]=1;
	    		     }
			}
             if(count>1)                   // if(count==1)
          // dublecates of elements    //  unique element contiond
                   System.out.println(a[x]+"=>"+count);

                  }
	}
}