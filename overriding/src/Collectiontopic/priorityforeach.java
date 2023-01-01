package Collectiontopic;

import java.util.PriorityQueue;

public class priorityforeach {
public static void main(String[] args) {
	PriorityQueue l1=new PriorityQueue();
	l1.add(20);
	l1.add(15);
	l1.add(10);
	l1.add(5);
	for(Object o1:l1)
	{
		System.out.println(o1);
	}
}
}
