package arrmethodwp;

import java.util.Scanner;

public class Dyninparrmwp {

static void array(int[] arr)
{
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println("sum of array is "+sum);
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int size=sc.nextInt();
	int[] arr=new int [size];
	System.out.println("ent the arr element");
	for(int i=0;i<arr.length;i++){
	arr[i]=sc.nextInt();
	}
	array(arr);

}
}
