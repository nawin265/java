class Cques1
{

public static void main(String []args)
{
int start=1,end=111,count=0,sum=0;
System.out.println(end +" factors are");

while(start<=end)
{
if(end%start==0)
{
count++;
sum=sum+start;
System.out.println(start);
}
start++;
}
if(count==2)
System.out.println(end +" is a prime number\n"+sum +" is the sum");
else
System.out.print(end +" not a prime number\n"+ sum +" is the sum");

}
}
