package program;

import java.util.Scanner;

public class Dynmicinpputarr {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("user give the input");
	int size=sc.nextInt();
	int[] arr=new int[size];
	System.out.println("enter the arrey");
	for(int i=0;i<arr.length;i++)
	{
	arr[i]=sc.nextInt();
	}	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
				
	}
}
}
