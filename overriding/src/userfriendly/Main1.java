package userfriendly;
class Bike implements Ola{
 public void ride()
{
System.out.println("ride with bike");	
}
}
class Cab implements Ola{
	public void ride(){
		System.out.println("ride with cab");
	}
}
class Auto implements Ola{
	public void ride(){
		System.out.println("ride with auto");
	}
}
class stimul {
	static void rides(Ola o1)
	{
		o1.ride();
	}
}
public class Main1 {
public static void main(String[] args) {
	Bike b1=new Bike();
	Cab c1=new Cab();
	Auto a1=new Auto();
	stimul.rides(b1);
	stimul.rides(c1);
	stimul.rides(a1);
}
}
