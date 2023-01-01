package Collectiontopic;

import java.util.ArrayList;

public class Arraddcolletion {
public static void main(String[] args) {
	int [] arr={10,15 ,30,50};
	ArrayList l1=new ArrayList();
	//l1.add(arr[0]);
	//l1.add(arr[1]);
	//l1.add(arr[2]);
	//l1.add(arr[3]); instade of that we will use for loop
     //System.out.println(l1);
	for(int i=0;i<arr.length;i++)
	{
		l1.add(arr[i]);
	}
	System.out.println(l1);
}
}
