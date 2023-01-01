package maptopic;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemaptop {
public static void main(String[] args) {
	TreeMap<String,Integer> l1=new TreeMap<String,Integer>();
	l1.put("Vikee",764);
	l1.put("mom",123);
	l1.put("Vikee",847);
	l1.put("dad",645);
System.out.println(l1);
for(Entry a1:l1.entrySet())
{
	System.out.println(a1.getKey()+" "+a1.getValue());
}
}
}
