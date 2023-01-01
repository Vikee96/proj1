package tostritopic;

public class Mobile extends Object{
 int mob_cost;
 String mob_name;
 String mob_colour;
 Mobile(int mob_cost,String mob_name,String mob_colour)
 {
	 this.mob_cost=mob_cost;
	 this.mob_name=mob_name;
	 this.mob_colour=mob_colour;
 }
 public String toString()
 {
	return "mobile cost is "+this.mob_cost
			+"\n mobile name is "+this.mob_name
			+"\n mobile colour is "+this.mob_colour;
 }
 public static void main(String[] args) {
	Mobile m1=new Mobile(16000,"poco","yellow");
 System.out.println(m1);
// System.out.println(m1.toString());
}
}
