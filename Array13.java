class Main // SELECTION SORT 
{
public static void main(String args[])
	{
         int a[]=new int[]{14,13,9,12,3,40};
           Main c1=new Main();
           int res[]= c1.selectionSort(a);
                for(int t:a)
                       System.out.println(t);
                                     
        }
int[] selectionSort(int a[])
                    {
                      for(int x=0;x<=a.length-2;x++)
                          {
                              int min=x;
                           for(int y=min+1;y<=a.length-1;y++)
                               {
                                 if(a[min]>a[y])
                                   {
                                     min=y;
                                    } 
                               }
                               int t=a[x];
                                   a[x]=a[min];
                                    a[min]=t;

                           }
                         return a;                    }

}


   