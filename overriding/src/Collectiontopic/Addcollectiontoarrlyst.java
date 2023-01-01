package Collectiontopic;

import java.util.ArrayList;

public class Addcollectiontoarrlyst {
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add((byte)5);
	l1.add((byte)7);
	l1.add((byte)8);
	l1.add((byte)9);
	l1.add((byte)10);
	byte[] arr=new byte[l1.size()];
	for(int i=0;i<l1.size();i++)
	{
		arr[i]=(byte)l1.get(i);
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}
