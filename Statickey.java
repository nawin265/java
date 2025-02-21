class Main
{
public static void main(String args[])
	{
          
             parent c1=new child();
               parent.add();
               child.add();
            
        }


}

class parent
{

 
     static void add()
           {
           
             System.out.println(" i am parent");

           }
}
class child extends parent
{

    
    static void add()
           {
           
             System.out.println("i am child");

           }
}

