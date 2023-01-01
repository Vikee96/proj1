package Collectiontopic;

import java.util.ArrayList;

public class Removeallmethod {
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(40);
	l1.add(50);
	ArrayList l2=new ArrayList();
	l2.add(40);
	l2.add(50);
	l2.add(60);
	l2.add(70);
	System.out.println("*****b4***\n l1------>"+l1);
	System.out.println("*****b4***\n l2------>"+l2);
	 l1.removeAll(l2);
	//l1.retainAll(l2);
System.out.println(" ***a4** \nl1------>"+l1);
System.out.println();

}
}
