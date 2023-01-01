package arrmethodwp;

import java.util.Scanner;

public class Dynamarrelmwp {
	static void array(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the array size");
			int size=s1.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the arrelement");
		for(int i=0;i<arr.length;i++){
			arr[i]=s1.nextInt();
		}
		array(arr);
	}
}
