package exceptionhandling;

public class Nestedcatcht {
public static void main(String[] args) {
	System.out.println("***main stsrts**");
	try{
	   int i=1/0;
	   }
	catch(ArithmeticException e)
	{
	 System.out.println("handeld..");
	 int [] arr={10,20,30};
	try{
		
		System.out.println(arr[8]);
	    }
	catch(ArrayIndexOutOfBoundsException e1)
	  {
		System.out.println("caught...");
	  }
	}
	System.out.println("***main ends**");
}
}
