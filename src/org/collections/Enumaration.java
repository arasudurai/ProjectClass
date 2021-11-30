package org.collections;

import java.util.Enumeration;
import java.util.Vector;

public class Enumaration {
	public static void main(String[] args) {
		
		Vector <String> a = new Vector <String>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("e");
		
		Enumeration<String> elements = a.elements();
		while (elements.hasMoreElements()) {
			String string = (String) elements.nextElement();
			System.out.println(string);
		}
		
		
		
		
		
	}

}
