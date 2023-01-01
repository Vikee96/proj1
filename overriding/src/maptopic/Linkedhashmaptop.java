package maptopic;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Linkedhashmaptop {
public static void main(String[] args) {
	LinkedHashMap<String,Integer> l1=new LinkedHashMap<String,Integer>();
	l1.put("VIKEE",123);
	l1.put("shilpi",143);
	l1.put("mom", 123);
	l1.put("vikram",543);
	System.out.println(l1);
	for(Entry a1:l1.entrySet())
	{
		System.out.println(a1.getKey()+" "+a1.getValue());
	}
}
}
