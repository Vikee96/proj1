package program;

import java.util.Scanner;

public class Sumofeharr {
public static void main(String[] args) {
Scanner s1=new Scanner(System.in);
System.out.println("enter arr size");
int size=s1.nextInt();
int [] arr={132,176,342,189,456};

	for(int i=0; i<arr.length;i++)
	{
	int no=arr[i];
	int sum=0;
	while(no!=0)
	{
	int rem=no%10;
	sum=sum+rem;
	no=no/10;
	}
	System.out.println(sum+" ");
	}
}
}
