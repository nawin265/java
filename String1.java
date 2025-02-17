class String1
{
public static void main(String args[])
	{
        String s="he1ll1o1",s2="";
              int rev=0;
          for(int x=0;x<=s.length()-1;x++)
              {
                char c=s.charAt(x);
                  if(c>='0'&&c<='9')
                     {
                        s2=s2+c;
                     }
               }

               System.out.println(s2);
              int num=Integer.parseInt(s2);4
                System.out.println(num);
                  int temp=num;
              for(;num!=0;num=num/10)
                  {
                      int rem=num%10;
                      rev=rev*10+rem;
                  }
                  if(temp==rev)
                      System.out.println(rev+" is a palidrome");
                     else
                        System.out.println(rev+" not a palidrome"); 
              
        }
}
         
