package equaltop;

public class Mobile {

	int mob_cost;
	 String mob_name;
	 String mob_colour;
	 Mobile(int mob_cost,String mob_name,String mob_colour)
	 {
		 this.mob_cost=mob_cost;
		 this.mob_name=mob_name;
		 this.mob_colour=mob_colour;
	 }
	 public boolean equals(Object o1)
	 {
		Mobile m2 =(Mobile)o1;
		return (this.mob_cost==m2.mob_cost)&&(this.mob_name==m2.mob_name);
		 //return (this.mob_cost==m2.mob_cost)&&(this.mob_colour==m2.mob_colour);

	 }
public static void main(String[] args) {
	Mobile m1=new Mobile(16000,"poco","yellow");
	Mobile m2=new Mobile(16000,"poco","black");
	System.out.println(m1.equals(m2));
}
}


