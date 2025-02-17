class Method1
{
public static void main(String args[])
 {
   Demo c1=new Demo();
     c1.sum1();
   int res= c1.sum2();
  System.out.println(res);
 
 }
        
}
    
class Demo
{
 
void sum1()
{
    int sum=0;
 for(int start=1;start<=10;start++)
    {
     sum=sum+start;
     }
     System.out.println(sum);
}

int sum2()
    {
         int sum=0;
 for(int start=1;start<=10;start++)
    {
     sum=sum+start;
     }
    return sum;
    }

}
