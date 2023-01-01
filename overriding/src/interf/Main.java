package interf;

public class Main implements Nike {
public void shoe(){
System.out.println("good soeeessss");	
}
public void cap(){
	System.out.println("good capuuuu");
}
public static void main(String[] args) {
	Main m1=new Main();
	m1.shoe();
	m1.cap();
}
}
