class Array9 // inserting of element
{
public static void main(String args[])
	{
         int a[]=new int[]{1,2,4,5,0}; //1 2 3 4 5
                int index=2,element=3;
                
                 for(int x=a.length-1;x>index;x--)
                      {
                        a[x]=a[x-1];

                       }  
                      a[index]=element;

                      for(int t:a)
                          System.out.println(t);
           }
}

   
          