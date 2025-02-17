class file1
{
	public static void main(String args[])
		{
		int num=12314,min=9,rem=0,count=0;
		for(;num!=0;num/=10)
			{
			rem=num%10;
			count++;
			}
			
		if(rem<min)
		min=rem;
		if(count>=min){
		System.out.println(min);
		}}
}