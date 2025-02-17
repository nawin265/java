class Main
{
public static void main(String args[])
	{
         String s="hello all good morining";
               String s4=s.concat(" All");
           String c[]=s.split(" ");
             int max=0;
            String s3=" ";
           
        for(int x=0;x<=c.length-1;x++)
            {
              String s2=c[x];
               
                if(max<s2.length())
                  {
                   
                     max=s2.length();
                       s3=s2;
                  }
                

            }
    System.out.println(max+" "+s3);
System.out.println(s4);

	}
}