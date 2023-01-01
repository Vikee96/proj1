package Abstraction;
class Bike implements Ola
{
	public void ride()
	{
		System.out.println("ride with bike");
	}
}
class Auto implements Ola
{
	public void ride()
	{
		System.out.println("ride with auto");
	}
}
class Car implements Ola
{
	public void ride()
	{
		System.out.println("ride with car");
	}
}
class Stimulat
{
static void Riding(Ola a1)
{
a1.ride();	
}
}
public class Maincls{
	public static void main(String[] args) {
		Bike b1=new Bike();
		Auto a1=new Auto();
		Car c1=new Car();
		Stimulat.Riding(a1);
		Stimulat.Riding(b1);
		Stimulat.Riding(c1);
	}
}