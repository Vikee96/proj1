package Collectiontopic;

import java.util.ArrayList;

public class collectiontoaddarraylist {
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add('A');
	l1.add(20.23);
	l1.add(true);
	Object[] arr=new Object[l1.size()];
	//arr[0]=l1.get(0);
	//arr[1]=l1.get(1);
	//arr[2]=l1.get(2);
	//arr[3]=l1.get(3); instade that a will use for loop
	for(int i=0;i<l1.size();i++)
	{
	arr[i]=l1.get(i);	
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}
