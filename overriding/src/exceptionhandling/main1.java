package exceptionhandling;

public class main1 {
public static void main(String[] args) {
	System.out.println("***main starts***");
try{
	int x=1/0;
}
catch(ArithmeticException e)
{
	System.out.println("handel...");
}
	System.out.println("**main ends***");
}
}
