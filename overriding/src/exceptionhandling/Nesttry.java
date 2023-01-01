package exceptionhandling;

public class Nesttry {
public static void main(String[] args) {
	System.out.println("**main stsrts**");
	
	try{
		int i=18/2;
		int[] arr={10,20,50};
		try{
			System.out.println(arr[i]);
		   }
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("caught...");
		}
	   }
	 catch(ArithmeticException e)
	 {
	System.out.println("handeled....");	 
	 }
	System.out.println("***main ends***");
}
}
