class Cquse4
{
public static void main(String []args)
{
int start=1,end=20;
long sum=1l;
while(start<=end)
{
if(start%2!=0)
System.out.println(start+"is odd");

sum=sum*start;
start++;
}
System.out.println(sum+"is a sum of odd");

}
}

