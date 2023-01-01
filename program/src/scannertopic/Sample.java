package scannertopic;

import java.util.Scanner;

public class Sample {
static int add(int a,int b)
{
	int c=a+b;
	//System.out.println(c);for method with parameter
	return c;//method with return type;

}
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("enter a value");
	int a=s1.nextInt();
	System.out.println("enter b value");
	int b=s1.nextInt();
	//add(a,b);for method with parameter
	int x=add(a,b);
	System.out.println(x);//method with return type;

}
}
