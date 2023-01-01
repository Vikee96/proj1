package Recursion;

public class Russiondall {
static void russiondall(int no)
{
	if(no==1){
		System.out.println("all dalls are open");
	}
	else{
		russiondall(no-1);
	}
}
public static void main(String[] args) {
	russiondall(10);
}
}
