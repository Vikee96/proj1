package Fibonaccie;

import java.util.Scanner;

public class Fibnoccie11num {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the number");
	int no=s1.nextInt();
	int fib1=0;
	int fib2=1;
	int fib3=0;
	for(int i=1;i<=no;i++)
	{
		fib3=fib1+fib2;
		System.out.println(fib3+" ");
		fib1=fib2;
		fib2=fib3;
	}
}
}
