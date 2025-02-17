class Cquse2
{
public static void main(String []args)
{
int start=1,end=20,n=3,pro=1;
while(start<=end)
{
pro=n*start;
System.out.println(n+"x"+start+"="+pro);
if(pro%2==0)
System.out.println(pro+"is a even");
else
System.out.println(pro+"is a odd");
start++;
}
}
}
	