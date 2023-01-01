package exceptionhandling;

public class trycatchfinallll {
public static void main(String[] args) {
	System.out.println("**main stsrts**");
	try{
	int i=1/0;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("handled..");
	}
	finally{
		System.out.println("hey im finally block");
	}
	System.out.println("**main ends**");
}
}
