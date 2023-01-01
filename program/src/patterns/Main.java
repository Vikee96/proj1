package patterns;

public class Main {
static void pattern() throws InterruptedException 
{
for (int i=1;i<=5;i++)
{
	for(int j=5;j>=1;i--)
	{
		if(i>=j)
		{
			Thread.sleep(100);
			System.out.print("*");
		}
		else{
			System.out.print(" ");
		}
	}
	System.out.println();
}
}
static void pattern1() throws InterruptedException
{
	for(int i=5;i>=1;i--)
	{
		for(int j=1;j<=5;j++)
		{
			if(i>=j)
			{
				Thread.sleep(200);
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
public static void main(String[] args) throws InterruptedException 
{
	pattern();
	
	pattern1();
}
}
