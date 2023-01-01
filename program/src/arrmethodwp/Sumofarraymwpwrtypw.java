package arrmethodwp;

import java.util.Scanner;


public class Sumofarraymwpwrtypw {
	static int sum(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		return sum;
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
		
		System.out.println(sum(arr));
		
	}
}