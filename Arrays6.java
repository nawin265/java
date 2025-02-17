

class Array6  // missing of numbers
{
public static void main(String args[])
	{
         int a[]=new int[]{1,5,9,2,0,};  // 3 4 6 7 8
        
           
               for(int x=0;x<=9;x++)
                   {
                      int count=0;
                     
                    for(int y=0;y<=a.length-1;y++)
                        {
                          if(x==a[y])
                            {
                              count++;
                               break;
                            }
                   
                         }
                    if(count==0)
                      System.out.println(x);
                         
                    }    
           }
}
