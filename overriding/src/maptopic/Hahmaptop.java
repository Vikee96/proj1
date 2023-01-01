package maptopic;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hahmaptop {
public static void main(String[] args) {
	HashMap<String,Integer> l1=new HashMap<String,Integer>();
	l1.put("vikee",123);
	l1.put("mom", 234);
	l1.put("dad", 234);
	l1.put("sam", 847);
	l1.put("sam", 987);
	System.out.println(l1);
	for(Entry a1:l1.entrySet())
	{
	System.out.println(a1.getKey()+" "+a1.getValue());	
	}
}
}
