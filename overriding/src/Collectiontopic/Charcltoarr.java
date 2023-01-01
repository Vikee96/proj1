package Collectiontopic;

import java.util.ArrayList;

public class Charcltoarr {
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add((char)'a');
	l1.add((char)'b');
	l1.add((char)'c');
	l1.add((char)'d');
	l1.add((char)'e');
	l1.add((char)'f');
System.out.println(l1);
char[] arr=new char[l1.size()];
for(int i=0;i<l1.size();i++)
{
	arr[i]=(char)l1.get(i);
}
for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
}
}
}
