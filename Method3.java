class Method3
{
public static void main(String args[])
   {
     Demo c1=new Demo();
      char res=c1.let();
   System.out.println(res);

   }
}
 class Demo
  {
    char let()
      {
       char letter='a';
       
        if(letter>='A'|| letter<='Z')
           return (char)(letter+32);
        else if(letter>='a'&& letter<='z')
           return (char)(letter-32);
          else
             return 'k';
       }
   }
  

                 