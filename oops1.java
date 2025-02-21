class Main 
{
public static void main(String arga[])
	{

          child c=new child();
             c.add();
             c.sub(); 
        }
}
interface one
	{
           void add();
        }
interface two
         {
          void sub();
         }

class child implements one,two
{
 public void add()
      {
      System.out.println("I am add implement of one");
      }
 public void sub()
      {
      System.out.println("I am sub implement of two");
      }
    
}
