package Sumofgivennum;

public class Sumofsum {
 static int sum(int no)
{
	int sum=0;
	while(no!=0)
	{
		int rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	return sum;
}
public static void main(String[] args) {
	int no=989876;
	while(no>9)
	{
		no=sum(no);
	}
	System.out.println(no);
}
}
