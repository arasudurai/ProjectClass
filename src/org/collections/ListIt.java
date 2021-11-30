package org.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListIt {
	public static void main(String[] args) {
		

		List <String> a = new ArrayList <String>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("e");
		
		ListIterator<String> listIterator = a.listIterator();
		
		
		while (listIterator.hasNext()) {
			String string = (String) listIterator.next();
			if (string.equals("c")) {
				listIterator.remove();
				
			}
			else if (string.equals("a")) {
				listIterator.add("f");
				
			}
			
			else if (string.equals("b")) {
				listIterator.set("A");
				
			}	
		}	
		System.out.println(a);
	
	
	while (listIterator.hasPrevious()) {
		String string = (String) listIterator.previous();
		System.out.println(string);
		
	}
	
	

}
}