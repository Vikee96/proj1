package arrmethodwp;

import java.util.Scanner;

public class dyninputmwpwrt {
	static int[] array(int[] arr)
	{
		return arr;
	}
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the array size");
			int size=s1.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the array element");
		for(int i=0;i<arr.length;i++){
			arr[i]=s1.nextInt();
		}
		
	int[] arr1=	array(arr);
	for(int i=0;i<arr1.length;i++)
	{
	System.out.println(arr1[i]);
	}
	
	}
}
