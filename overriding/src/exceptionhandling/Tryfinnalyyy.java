package exceptionhandling;

public class Tryfinnalyyy {
public static void main(String[] args) {
	System.out.println("***main starts***");
	try{
	int i=1/0;
	}
	finally{
		System.out.println("hey i am finally");
	}
	System.out.println("**main ends**");
}
}
