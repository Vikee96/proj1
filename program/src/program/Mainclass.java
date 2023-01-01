package program;

import java.util.Scanner;

public class Mainclass{
	static int fibnoc(int no)
	{
		int fib1=0;
		int fib2=1;
		int fib3=0;
		for(int i=1;i<=no;i++)
		{
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
		}
		return fib3;
	}
	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("enter no");
		int y=s1.nextInt();
		System.out.println(fibnoc(y));
	}
}
