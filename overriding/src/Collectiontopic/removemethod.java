package Collectiontopic;

import java.util.ArrayList;

public class removemethod {
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add(3);
	l1.add(5);
	l1.add("delhi");
	l1.add("banglore");
	l1.add("bijapur");
	System.out.println(l1);
	l1.remove(3);
	System.out.println(l1);
	l1.remove("delhi");
	System.out.println(l1);
}
}
