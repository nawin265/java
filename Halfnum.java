
class Half
{
public static void main(String args[])
{
int num=34565,temp=num,count=0,power=0,first=0,second=0,sum=0,power2=0,first2=0,second2=0;
long pro=1l;
 for(;num!=0;num=num/10)
     {
       int rem=num%10;
          count++;
     }
   if(count%2==0)
     {
     power=(int)Math.pow(10,count/2);
         first=temp/power;
	 second=temp%power;
         sum=first+second;
System.out.println(count+" count"+"\nfirst num= "+first+"\nsecond num="+second+"\nsum is="+sum);
     }
	else 
	{
	power2=(int)Math.pow(10,count/2);//5/2=2.5
        first2=temp/power;
         second2=temp%power;
          pro=first2*second2;
System.out.println(count+" count"+"\nfirst num= "+first2+"\nsecond num="+second2+"\npro is="+pro);
        }
        
System.out.println( temp+" cannot work with the number");
  
}
}
   