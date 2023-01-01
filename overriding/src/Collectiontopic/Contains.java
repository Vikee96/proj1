package Collectiontopic;

import java.util.ArrayList;

public class Contains {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add("goa");
		l1.add("monday");
		l1.add("banglore");
		l1.add("delhi");
		l1.add("bijanagar");
        l1.add(" delhi");
        if(l1.contains("delhi"))
        {
        	System.out.println("delhi is present");
        }
        else
        {
        	System.out.println("delhi is not present");
        }
	}
}
