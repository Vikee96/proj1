package exceptionhandling;

public class Nestedexcept {
public static void main(String[] args) {
	System.out.println("***main stsrts***");
	
	try{
		int i=1/0;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("handeld..");
	}
	catch(ArithmeticException e)
	{
		System.out.println("cautch..");
	}
	System.out.println("***main ends...");
} 
}
