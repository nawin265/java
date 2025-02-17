class String5 // dubicate elements in a String
{
public static void main(String args[])
	{
        String s="madam arror teacher malayalam";
             String a[]=s.split(" ");
             
               for(int x=0;x<=a.length-1;x++)
                  {
                   String temp="";
                   String s2=a[x];
                   for(int y=0;y<s2.length();y++)
                       {
                        char c=s2.charAt(y);
                            
                        if(s2.indexOf(c)!=s2.lastIndexOf(c))
                           {
                             if(temp.indexOf(c)==-1)
                             {
                             temp=temp+c;
                             }
                           } 
                        } 
                       System.out.println(s2+" => "+temp);
                   
                    }
	}
}
  