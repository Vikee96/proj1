package Recursion;

public class Recursionprint1to10 {
static void number(int no)
{
	if(no>=10){
		System.out.println(no);
	}
	else{
		System.out.println(no);
		number(no+1);
	}
}
public static void main(String[] args) {
	number(1);
}
}
