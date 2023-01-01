
public class Vikee {
void send(int no){
System.out.println("vikee send nummber to shipi with i love u "+no);	
}
void send(String name){
	System.out.println("vikee sendde to his name with i miss u "+name);
}
void send(int no,String name){
System.out.println("again vikee sended no with namme with kisses "+no+" "+name );
}
void send(String name,int no){
	System.out.println("again vikee sende name with no with i love u a lot "+name+" "+no);
}
public static void main(String[] args) {
	Vikee v1=new Vikee();
	v1.send(885);
	v1.send("vikram");
	v1.send(193,"vikee");
	v1.send("vikee",2117);
}
}
