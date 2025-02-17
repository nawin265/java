class Method2
{
public static void main(String args[])
    {
     Demo c1=new Demo();
         c1.even1();
      String res= c1.even2();
       System.out.println(res);

     }
}
class Demo
{
   int x=10;//instance variable
   void even1()
           {
             int num=13;//local variables
             if(num%2==0)
               System.out.println(num+" even ");
              else
               System.out.println(num+" odd ");
             }
   String even2()
               {
                int num1=13;
                if(num1%2==0)
                return " even ";
                else
                return " odd ";
               }
  }