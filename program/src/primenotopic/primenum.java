package primenotopic;

import java.util.Scanner;

public class primenum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int no=sc.nextInt();
	boolean flag=true;
	for(int i=2;i<no;i++)
	{
		if(no%i==0)
		{
		flag=false;
		break;
		}
	}
	if(flag==true)
	{
		System.out.println(no+" is prime number");
	}
	else{
		System.out.println(no+" is not prime number");
	}
}
}
