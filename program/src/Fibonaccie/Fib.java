package Fibonaccie;

public class Fib {
static void fibnoccie()
{  
	int fib1=0;
	int fib2=1;
	int fib3=0;
	for(int i=1;i<=10;i++){
		fib3=fib1+fib2;
	 System.out.println(fib3+" ");;

		fib1=fib2;
		fib2=fib3;
	}

}
public static void main(String[] args) 
{
	fibnoccie();
}
}
