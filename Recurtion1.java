class Recurtion1
{
public static void main(String args[])
	{
          Demo c1=new Demo();
               c1.rect1(5,1,1);



         }
}
class Demo
      {
      void rect1(int n,int fact,int start)
               {
                if(start==n+1)
                   System.out.println( fact);

                 else
		{

                    fact=fact*start;
                   rect1( n, fact,start+1);
                } 
               }   
     }
