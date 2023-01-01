package program;

import java.util.Scanner;

public class sumofeacharrrr {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("enter ther size of the array");
	int size=s1.nextInt();
	int[] arr=new int[size];
	System.out.println("enter the arrey element");
	for(int i=0; i<arr.length;i++)
	{
	arr[i]=s1.nextInt();
    }	 
	for(int i=0; i<arr.length;i++)
	{
		int no=arr[i];
		int sum=0;
		while(no!=0){
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println(sum+" ");
	}
}
}

