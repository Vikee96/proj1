package love;
interface Vikee
{
	void love();
}
interface Shilpi extends Vikee
{
	void morelove();
}
class Loves implements Shilpi
{
	public void love(){
		System.out.println(" shilpi deserve more love");
	}
	public void morelove()
	{
		System.out.println("vikee varymuch loves with Shilpi");
	}
}
public class Main {
public static void main(String[] args) {
	Loves l1=new Loves();
	l1.love();
	l1.morelove();
}
}
