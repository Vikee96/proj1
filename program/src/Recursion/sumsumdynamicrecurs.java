package Recursion;

import java.util.Scanner;

public class sumsumdynamicrecurs {
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
Scanner sc=new Scanner(System.in);
System.out.println("enter the num");
	int no=sc.nextInt();
System.out.println(add(no));
}
}
