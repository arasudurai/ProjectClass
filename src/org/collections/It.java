package org.collections;

import java.util.Iterator;
import java.util.Vector;

public class It {
	public static void main(String[] args) {
		Vector <String> a = new Vector <String>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("e");
		
		 Iterator<String> iterator = a.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			
			if (string.equals("a")) {
				iterator.remove();
				
			}
			
		}
		
		System.out.println(a);
		System.out.println("demo page");
		System.out.println("demo page");

		

		
		
	}

}
