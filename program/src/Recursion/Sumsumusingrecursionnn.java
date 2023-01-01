package Recursion;

public class Sumsumusingrecursionnn {
static int add(int no)
{
	int sum=0;
	while(no!=0)
	{
		int rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	while(sum>9)
	{
	
		return add(sum);
		
	}
	
	return sum;
}
public static void main(String[] args) {
	int no=789;
System.out.println(add(no));
}
}
