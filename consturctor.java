class Main
{
public static void main(String args[])
     {
         child c1=new child(10);
            
        
     }
}

class Grandparent
{
     Grandparent()
       {  
             this(10,2.2);
             System.out.println(" default grandparent ");
       }
      Grandparent(int x,double y)
       {
         System.out.println(" int double of grantparent");
       }
}
class parent extends Grandparent
 {
       parent()
       {s
          this(20);
          System.out.println(" defult const of parent");
       }
       parent(int x)
       {
           super();
          System.out.println("  int const of parent ");
       }

 }

class child extends parent
{
       child()
       {
          super();
          System.out.println(" defult const of child ");
       }
      child(int x)
       {
          this();
          System.out.println("  int  const of child");
       }
}
