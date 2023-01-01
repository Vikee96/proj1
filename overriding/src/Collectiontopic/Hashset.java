package Collectiontopic;

import java.util.HashSet;

public class Hashset {
public static void main(String[] args) {
	HashSet l1=new HashSet();
	l1.add(10);
	l1.add("h11");
	l1.add(10.26);
   l1.add('A');
   l1.add(10);
   System.out.println(l1);
   for(Object o1:l1)
   {
	   System.out.println(o1);
   }
}
}
