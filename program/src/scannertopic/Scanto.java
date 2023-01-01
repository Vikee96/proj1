package scannertopic;

import java.util.Scanner;

public class Scanto {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("enter a value");
	double a=s1.nextDouble();
	System.out.println("enter b value");
	double b=s1.nextDouble();
	double c=a+b;
	System.out.println(c);
}
}
