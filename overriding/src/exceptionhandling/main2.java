package exceptionhandling;

public class main2 {
public static void main(String[] args) {
	System.out.println("***main starts***");
	int[] arr={10,20,30};
	try{
	System.out.println(arr[7]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("caught...");	
	}
	System.out.println("***main ends**");
}
}
