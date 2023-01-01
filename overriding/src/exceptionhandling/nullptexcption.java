package exceptionhandling;

public class nullptexcption {
public static void main(String[] args) {
	System.out.println("**main starts**");
	nullptexcption n1=null;
	try{
	System.out.println(n1.hashCode());
	}
	catch(NullPointerException e)
	{
		System.out.println("handeled...");
	}
	System.out.println("**main ends**");
}
}
