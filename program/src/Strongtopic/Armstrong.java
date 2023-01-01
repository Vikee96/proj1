package Strongtopic;


public class Armstrong {
public static void main(String[] args) {
	int no=1634;
	int copy=no;
	int no1=no;
	double sum=0;
	int count=0;
	while(no1!=0)
	{
		count++;
         no1=no1/10;
	}
	while(no!=0)
	{
		int rem=no%10;
		sum=sum+Math.pow(rem,count);
		no=no/10;
	}
	if(copy==sum)
	{
		System.out.println(" it is armstrong");
	}
	else{
		System.out.println("is not armstrong");
	}
}
}
