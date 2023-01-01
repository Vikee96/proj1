package Collectiontopic;

import java.util.ArrayList;

public class Size_Getmethod {
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(40);
	l1.add(50);
	//Object o1=l1.get(0);
	//System.out.println(o1);
	//Object o2=l1.get(1);
  //System.out.println(o2);
	for(int i=0; i<l1.size();i++)
	{
     Object o1=l1.get(i);
    	System.out.println(o1);	 
	}
}
}
