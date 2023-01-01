package Collectiontopic;

import java.util.LinkedList;

public class Linkedlist {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(10);
	l1.add('A');
	l1.add("hello");
	l1.add(20.56);
	l1.add(10);
	System.out.println(l1);
	System.out.println(l1.get(1));
	System.out.println(l1);
	System.out.println(l1.poll());
	System.out.println("**a4**pool-->"+l1);
	System.out.println(l1.peek());
	System.out.println("**a4***-->"+l1);
}
}
