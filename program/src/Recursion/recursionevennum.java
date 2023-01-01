package Recursion;

public class recursionevennum {
static void number(int no)
{
	if(no>=10)
	{
		System.out.println(no);
	}
	else{
		if(no%2==0)
		{
			System.out.println(no);
		}
		number(no+1);
	}
}
public static void main(String[] args) {
	number(1);
}
}
