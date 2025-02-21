import  java.util.Scanner;

class Main
{
public static void main(String args[])
 	{
        Scanner s=new Scanner(System.in);
            String choice; 
            
           do
              {
          	System.out.println(" enter a number");
            	 int num=s.nextInt();

                 if(num%2==0)
                   {
                    System.out.println(num+" is a even number");
                   }
                  else 
                     {
                       System.out.println(num+" is a odd number");
                     }

                    System.out.println(" if you want to countinue enter YES or enter NO ");

                    choice=s.next();
               } 
              while(choice.equals("yes"));
        
	}
}