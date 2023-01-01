package exceptionhandling;

public class Excepupcast {
public static void main(String[] args) {
	System.out.println("main starts");
	try{
	  int i=1/0;
	  }
	catch(Exception e)
	{
		System.out.println("hendeled..");
	}
	//catch(ArithmeticException e) it will not catch
	//{
		//System.out.println("handeled..");
	//}
	System.out.println("caught");
}
}
