class Array5
{
public static void main(String args[])
      {
        int a[]=new int[]{25,35,44,12,2,8,7};
         
         for(int x=0;x<=a.length-1;x++)
             {
              int num=a[x];
               int count=0;
              for(int start=1;start<=num;start++)
                  {
                   if(num%start==0)
                     {
                      count++;
                     }
                    
                   }
                 if(count==2)
                  {
                   System.out.println(num+" is a prime");
                  }
             }
        }
}