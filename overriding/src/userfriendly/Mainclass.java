package userfriendly;
class Dog implements Animal{
	public void noise()
	{
		System.out.println("bow bow");
	}
}
class Cat implements Animal{
		public void noise()
		{
		System.out.println("meaaaoo meaooo");	
		}
	}
class Snake implements Animal{
	public void noise()
	{
	System.out.println("hiss hiss");	
	}
}
class Stimulator{
	static void ansim(Animal a1)
	{
	a1.noise();
	}
}
public class Mainclass {
	public static void main(String[] args) {
Cat c1=new Cat();
Dog d1=new Dog();
Snake s1=new Snake();
Stimulator.ansim(c1);
Stimulator.ansim(d1);
Stimulator.ansim(s1);
}

}
