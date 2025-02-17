class Recurtion2
{
public static void main(String args[])
	{
           Demo c1=new Demo();
           c1.rect2(0,1,0,1,10);
          
         }
}
class Demo
{
     void rect2(int a,int b,int c,int start,int n)
              {
               if(start==n+1)
                {

                 }
                else
                   {
                   System.out.print(a+" ");
                    c=a+b;
                    //System.out.print(a+" ");

                    // a=b;
                    // b=c;
                     rect2(b,c,a,start+1,n);

                    }
                }
}