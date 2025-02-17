class Methodarray1
{
public static void main(String args[])
       {
          int a[]=new int[]{ 10,11,12,13,14,15,16};
              System.out.print("ORGNAL ARRAY");
                 for(int temp1:a)
                       System.out.print(temp1+" ");
             Methodarray1 c1=new Methodarray1();
              int[] res= c1.arrayRotation(a);
                for(int temp:res)
                     System.out.println(temp+" ");


        }
      int[] arrayRotation(int[] a)
                  {
                    int x;
                       int temp=a[0];
                     for(x=0;x<a.length-1;x++)
                        {
                         a[x]=a[x+1]; 
                         }
                         a[a.length-1]=temp;
                        return a;
                   
                  }

}